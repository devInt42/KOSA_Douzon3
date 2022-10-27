package board.controller;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import board.model.BoardVO;
import config.SqlSessionFactoryBean;

public class BoardDAO {

	private SqlSession  sqlSession;
	
	public BoardDAO() {
		sqlSession = SqlSessionFactoryBean.getSqlSessionInstance();
	}
	
	public void deleteBoard(int seq) {
		sqlSession.delete("BoardDAO.deleteBoard", seq);
		sqlSession.commit();
	}
	
	public void updateBoard(BoardVO vo) {
		sqlSession.update("BoardDAO.updateBoard", vo);
		//sqlSession.commit();
	}
	
	public void insertBoard(BoardVO vo) {
		sqlSession.insert("BoardDAO.insertBoard", vo);
		sqlSession.commit();  //
	}
	// 전체보기
	public List<BoardVO> getBoardList(BoardVO vo) {
		return sqlSession.selectList("BoardDAO.getBoardList", vo);
	}
	// 원하는 번호 글 보기
	public BoardVO getBoard(int seq) {
		return sqlSession.selectOne("BoardDAO.getBoard", seq);
	}
	
	public List<BoardVO> getBoardSearch(BoardVO vo) {
		return sqlSession.selectList("BoardDAO.getBoardSearch", vo);
	}
}






