package com.javassem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.javassem.domain.ReplyVO;
import com.javassem.service.ReplyServiceImpl;

@RestController
public class ReplyController {

	//----------------------------------------------
	// 1. 댓글입력
	
	/* // 확인1
	 * @PostMapping("replies/new") 
	 * public String insert(String reply) {
	 * System.out.println("reples/new : " + reply); 
	 * return reply; 
	 * }
	 */
	
	/* // 확인 2 -> 여기서 DB에 입력까지는 알아서
	@PostMapping("replies/new") 
	public String insert(ReplyVO vo) {
		System.out.println("reples/new : " + vo); 		
		return "ok"; 
	} */
	 
	
	@Autowired
	ReplyServiceImpl replyService;
	
	@PostMapping("replies/new") 
	public String insert(ReplyVO vo) {
//	public String insert(@RequestBody ReplyVO vo) {
//		System.out.println(vo);
		System.out.println("reples/new : " + vo); 	
		if(replyService.insertReply(vo)==1) return "ok";
		else return "fail";
	}
	
	//-----------------------------------------------
	// 2. 댓글목록출력
	
	/* // 확인1
	@GetMapping("replies")
	public List<ReplyVO> list(){
		List<ReplyVO> list = new ArrayList<ReplyVO>();		
		for(int i=0; i<3; i++) {
			ReplyVO vo = new ReplyVO();
			vo.setRno(i);
			vo.setReply("테스트2");
			vo.setReplyer("홍길동2");
			list.add(vo);
		}		
		return list;
	}*/
	
	// 확인2 - DB에서 목록 가져오기
	@GetMapping("replies")
	public List<ReplyVO> list(){
		return replyService.selectAllReply();
	}
	
	
	//------------------------------------------------------
	// 3. 삭제
	@DeleteMapping("replies/{rno}")
	public int delete(@PathVariable String rno) {
		//System.out.println("---- " + rno);
		return replyService.deleteReply(rno);
	}
	
	//------------------------------------------------------
	// 4. 수정
	@PutMapping("replies/{rno}")
	public String modify(@RequestBody String vo) { // ReplyVO vo로 rno만 넘어오고 다른변수에는 안 넘어오네
		//System.out.println("++++ " + vo);
		JsonObject jsonObject = new JsonParser().parse(vo).getAsJsonObject();
		//System.out.println("++++ " + jsonObject.get("reply"));
		
		
		return "ok";
	}
}
