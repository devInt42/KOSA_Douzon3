package board.view;

import java.util.List;
import java.util.Scanner;

import board.controller.BoardDAO;
import board.model.BoardVO;

public class MainEntry {
	public static void main(String[] args) {
		
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		
		//delete
		dao.deleteBoard(1);
		
		//update
//		vo.setSeq(3);
//		vo.setContent("내용333");
//		vo.setTitle("제목3333");
//		dao.updateBoard(vo);
		
		// insert
		Scanner sc = new Scanner(System.in);
//		System.out.println("게시판 글쓰기: 제목/작성자/내용 입력 : ");
//		vo.setTitle(sc.next());
//		vo.setWriter(sc.next());
//		vo.setContent(sc.next());
//		dao.insertBoard(vo);
		
		// select 
//		System.out.println("보고싶은 글 번호 입력 : ");
//		int num = sc.nextInt();
//		vo = dao.getBoard( num );
//		System.out.println( vo.toString());
		
		//getBoardSearch
		System.out.println("원하는 필드와 값은 ? ");
		String condition = sc.next();
		String value = sc.next();
		vo.setSearchCondition(condition);
		vo.setSearchKeyword(value);
		
		List<BoardVO> list = dao.getBoardSearch(vo);
		for (BoardVO board : list ) {
			System.out.println( board.toString());
		}
		
		// selectAll
//		List<BoardVO> list = dao.getBoardList(vo);
//		for (BoardVO board : list ) {
//			System.out.println( board.toString());
//		}
	}
}
