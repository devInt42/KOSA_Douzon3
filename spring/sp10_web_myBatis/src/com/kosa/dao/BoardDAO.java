package com.kosa.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.stereotype.Component;

import com.kosa.config.SqlSessionFactoryService;
import com.kosa.model.BoardDTO;

@Component
public class BoardDAO {

	private SqlSessionFactory sqlSessionFactory;
	private SqlSession sqlSession = null; // DML ó�� �Լ��� ���� �ִ�.

	public BoardDAO() {
		sqlSessionFactory = SqlSessionFactoryService.getSqlSessionFactory();
	}

	// select all
	public List<BoardDTO> selectAll() {
		try {
			sqlSession = sqlSessionFactory.openSession(); // app�� db�� ����(���)
			return sqlSession.selectList("dao.selectAll");

		} catch (Exception e) {
			return null;
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		} // try end
	}

	// insert
	public int insert(BoardDTO dto) {

		try {
			sqlSession = sqlSessionFactory.openSession();
			int result = sqlSession.insert("dao.insert", dto);
			sqlSession.commit(); //
			return result;

		} catch (Exception e) {
//			sqlSession.rollback();  // ���� ���� ����� �ǹ̰� ����.
			return 0;
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		} // try end
	} // write end

	// delete
	public int delete(int seq) {
		try {
			sqlSession = sqlSessionFactory.openSession();
			int rowcount = sqlSession.delete("dao.delete", seq);
			sqlSession.commit();
			return rowcount;

		} catch (Exception e) {
			return 0;
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		} // try end
	} // delete end

	// detailList
	public BoardDTO detailList(int seq) {
		try {
			sqlSession = sqlSessionFactory.openSession();
			BoardDTO dto = sqlSession.selectOne("dao.detailList", seq);
			return dto;
		} catch (Exception e) {
			return null;
		} finally {
			if (sqlSession != null) {
				sqlSession.close();
			}
		}
	} // end detail
	
	// update
	public int update(BoardDTO dto) {  
		try{
			sqlSession = sqlSessionFactory.openSession();
			int rowcount= sqlSession.update("dao.update", dto);
			sqlSession.commit();
			return rowcount;
			
		}catch(Exception e){			return 0;		}
		  finally {		if(sqlSession != null){ sqlSession.close(); }		
		}
	} // end update
	
	//��ü �˻� ��ȸ_1
			public List<BoardDTO> getSearchList(Map<String, String> map){
				try{
					 /*for(Map.Entry<String, String> m : map.entrySet()){
						 System.out.println(m.getKey() + "/" + m.getValue() +"-");
					 }*/
					 sqlSession = sqlSessionFactory.openSession();
					 return sqlSession.selectList("dao.selectSearch" ,map);
				}catch(Exception e){
					 return null;
				}finally{
					if(sqlSession != null){ sqlSession.close(); }
				}
			}

	// ��ü �˻� ��ȸ_2
	public List<BoardDTO> getSearchList2(Map<String, String> map) {

		try {
			/*
			 * for(Map.Entry<String, String> m : map.entrySet()){
			 * System.out.println(m.getKey() + "/" + m.getValue() +"-"); }
			 */
			sqlSession = sqlSessionFactory.openSession();
			return sqlSession.selectList("dao.selectSearch2", map);
			
		} catch (Exception e) {
			return null;
		} finally {
			if (sqlSession != null) {		sqlSession.close();		}
		}
	}
}
