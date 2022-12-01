package com.javassem.basic;


import java.util.ArrayList;
import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javassem.domain.SampleVO; 

@RestController
public class SampleController {

	// 1.문자열 반환
	@GetMapping(value="/getText", produces="text/plain; charset=UTF-8")
	public String getText() {
		return "컨트롤러에서 보냄";
	}
	
	
	// 2. 객체 반환
	@GetMapping(value="/getObject")
	public SampleVO getObject(Model model) {
		SampleVO vo = new SampleVO("홍길동",33,"우리는 행복한다"); 
		model.addAttribute("vo", vo);
		
		return vo;
	}
	
	// 3. 리스트 객체 반환
	@GetMapping(value="/getList")
	public List<SampleVO> getList() {
		List list = new ArrayList();
		list.add(new SampleVO("홍길동",33,"우리는 행복한다"));
		list.add(new SampleVO("홍길자",22,"우리는 행복한다2"));
		list.add(new SampleVO("홍길숙",25,"우리는 행복한다3"));
		return list;
	}
	
	// 4. URL에서 정보 얻기
	@GetMapping(value="/sample/{cate}/{cno}")
	public String[] getPath(@PathVariable String cate, @PathVariable Integer cno) {
		return new String[] {"카테고리:"+cate, "번호:"+cno};
	}
	
	// 5. POST 전송
	@PostMapping(value="/sample/data")
//	public SampleVO post(SampleVO vo) {
	public SampleVO post(@RequestBody SampleVO vo) {
		System.out.println(vo);

		System.out.println("[확인]");
		return vo;
	}

	
}
