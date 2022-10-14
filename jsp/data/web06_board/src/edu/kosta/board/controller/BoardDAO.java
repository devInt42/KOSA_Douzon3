package edu.kosta.board.controller;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import dbclose.util.CloseUtil;
import edu.kosta.board.model.BoardVO;

public class BoardDAO {  // controller
	
	private static BoardDAO instance = new BoardDAO();	// �ѹ��� ��ü�� �����Ͽ� ��� Ŭ���̾�Ʈ���� ����
	
	public static BoardDAO getInstance(){
		return instance;
	}// getInstance()
	
	// ������
	public BoardDAO(){}  
		
	// DB����
	public Connection getConnection() throws Exception{
		// ������ JNDI & POLL ���·� ���� ��ü �����ؼ� ����
		Context ctx = new InitialContext();
		//Context env = (Context)ctx.lookup("java:comp/env");
		DataSource ds = (DataSource)ctx.lookup("java:comp/env/jdbc:BoardDB");	
		//DBMS ������ ã�µ� ����
		DriverManager.setLogWriter(new PrintWriter(System.out));
		
		return ds.getConnection();
	}// getConnection();
	
	//insert(vo) method - ���ο� ���� �Խ��ǿ� �߰�, �� �Է� ó���� ���
	public int insert(BoardVO vo) {
		Connection conn = null ;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		//�亯 ������ �Ϲ�(�� �Խñ�)���� �����ؼ� �Է� ��Ű�� ����
		int num = vo.getNum();				//������ �θ� �۹�ȣ
		int ref = vo.getRef();					//�θ��� ref(�׷� ��ȣ)
		int re_step = vo.getRe_step();		//�θ��� �׷쳻 ����
		int re_level = vo.getRe_level();		//�θ��� �׷쳻 ����
		int number = 0;							// board ���̺� �� ��ȣ
		StringBuffer sb = new StringBuffer();
		
		try {
			conn = getConnection();
			//���� board ���̺� ���ڵ� ���� �Ǵܰ� �� ��ȣ ����
			pstmt = conn.prepareStatement("SELECT MAX(NUM) FROM BOARD");
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				number = rs.getInt(1) + 1;     // 1 : num , ���� �� ��ȣ�� ���� ū ��ȣ + 1 
			} else {
				number = 1;
			} // if end
			
			//����۰� �亯�� ���� ���� ����
			if( num != 0 ) {  //�亯��
				re_level = re_level + 1;
				
				pstmt = conn.prepareStatement(
						"SELECT MAX(RE_STEP) FROM BOARD WHERE REF = ? AND RE_LEVEL = ? ");
				pstmt.setInt(1, ref);
				pstmt.setInt(2, re_level);
				rs = pstmt.executeQuery();
				
				if( rs.next() ) {
					if( re_step == 0 ) {
						re_step = rs.getInt(1) + 1;
					}
				} else {
					re_step = 0; 			// ù��° ��
				} // in if end
				
			} else {				// �θ���� ��� �۹�ȣ ����
				ref= number;
				re_step = 0;
				re_level = 0;
			} // out if end
			
			//insert ��� ó��
			sb.append("INSERT INTO BOARD(NUM, WRITER, SUBJECT, EMAIL, CONTENT, PASSWD, REG_DATE, ");
			sb.append(" REF, RE_STEP, RE_LEVEL, IP) VALUES(BOARD_NUM.NEXTVAL, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ) ");
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setString(1, vo.getWriter());
			pstmt.setString(2, vo.getSubject());
			pstmt.setString(3, vo.getEmail());
			pstmt.setString(4, vo.getContent());
			pstmt.setString(5, vo.getPasswd());
			pstmt.setTimestamp(6, vo.getReg_date());
			
			pstmt.setInt(7, ref);
			pstmt.setInt(8, re_step);
			pstmt.setInt(9, re_level);
			pstmt.setString(10, vo.getIp());			
			
			pstmt.executeUpdate();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}	
		return 0;
	} // insert() end
	
	//getListAllCount() : list.jsp ���������� ����� ���ڵ� ���� ������ �޼ҵ�
	public int getListAllCount() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int count = 0;
		
		try {
			conn = getConnection();
			
			//���� board ���̺��� ���ڵ� �� ���ϱ�
			pstmt = conn.prepareStatement("SELECT COUNT(*) FROM BOARD" );
			rs = pstmt.executeQuery();
			
			if( rs.next() ) count = rs.getInt(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}	
		return count;
	} // getListAllCount() end
	
	//getSelectAll(startRow, endRow) : list.jsp ���� ����� ��ü ���ڵ� ��� �޼ҵ�
	public List<BoardVO> getSelectAll( int start,  int end ) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		List  list = null;
		
		try {
			conn = getConnection();
			StringBuffer  sb = new StringBuffer();
			// ��� 3>
			//sb.append("SELECT j.* FROM (	SELECT k.*, rownum r FROM( SELECT * FROM board ORDER BY ref desc, re_step asc	) k ) j WHERE j.r BETWEEN ? AND ?");
			
			// ��� 2>
			//sb.append("select * from (select rownum as r,  x.*   from (select *  from board  order by ref desc, re_step asc)  x ) where r BETWEEN ? and ?");
			
			//��� 1>
			/*sb.append("SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, ROWNUM R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT ");
			sb.append("FROM BOARD ORDER BY REF DESC, RE_STEP ASC, re_level ) ORDER BY REF DESC,  re_step asc, re_level asc, reg_date asc) WHERE R>=? AND R<=?");*/
			
			//��� 4>
			/*sb.append("SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, ROWNUM R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT ");
			sb.append("FROM BOARD GROUP BY NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT ORDER BY REF DESC, RE_STEP ASC) ");
			sb.append("ORDER BY REF DESC, RE_STEP ASC, RE_LEVEL DESC, REG_DATE asc) WHERE R>=? AND R<=? ORDER BY R asc ");*/
			
			// ���� ����
			sb.append("SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT, ROWNUM R ");
			sb.append("FROM(SELECT NUM, WRITER, EMAIL, SUBJECT, PASSWD, REG_DATE, REF, RE_STEP, RE_LEVEL, CONTENT, IP, READCOUNT ");
			sb.append("FROM BOARD ORDER BY REF DESC, RE_STEP ASC) ORDER BY REF DESC,  re_step asc, re_level asc, reg_date asc) WHERE R>=? AND R<=?");
			
			pstmt = conn.prepareStatement(sb.toString());
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				list = new ArrayList(end);
				
				do {
					BoardVO vo = new BoardVO();
					vo.setNum(rs.getInt("num"));
					vo.setWriter(rs.getString("writer"));
					
					vo.setEmail(rs.getString("email"));
					vo.setSubject(rs.getString("subject"));
					vo.setPasswd(rs.getString("passwd"));
					vo.setReg_date(rs.getTimestamp("reg_date"));
					
					vo.setReadcount(rs.getInt("readcount"));
					vo.setRef(rs.getInt("ref"));
					vo.setRe_level(rs.getInt("re_level"));
					vo.setRe_step(rs.getInt("re_step"));
					
					vo.setIp(rs.getString("ip"));
					vo.setContent(rs.getString("content"));
					
					// list ��ü�� ������ ���� Bean�� BoardVO ��ü�� �����Ѵ�.
					list.add(vo);
					
				} while( rs.next() ) ;	
			} // if end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}				
		return list;
	} // getSelectAll(startRow, endRow) end
	
	// getDataDetail( num ) - content.jsp �󼼺��� ������
	// num �� �ش��ϴ� ���ڵ带 board ���̺��� �˻���
	public BoardVO getDataDetail( int num ) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		BoardVO vo = null;
		String sql = "";
		
		try {
			conn = getConnection();
			//��ȸ�� ����
			sql = "UPDATE BOARD SET READCOUNT = READCOUNT + 1 WHERE NUM = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			pstmt.executeQuery();
			
			pstmt = conn.prepareStatement("SELECT * FROM BOARD WHERE NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setWriter(rs.getString("writer"));	
				vo.setEmail(rs.getString("email"));
				vo.setSubject(rs.getString("subject"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setReg_date(rs.getTimestamp("reg_date"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setRef(rs.getInt("ref"));
				vo.setRe_level(rs.getInt("re_level"));
				vo.setRe_step(rs.getInt("re_step"));
				vo.setIp(rs.getString("ip"));
				vo.setContent(rs.getString("content"));
			} // if end			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}			
		return vo;
	} // getDataDetail() end
	
	// update(num) - ������Ʈ�� ����ϴ� �޼ҵ�
	public BoardVO  update( int num ) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		BoardVO vo = null;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT * FROM BOARD WHERE NUM = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				vo = new BoardVO();
				vo.setNum(rs.getInt("num"));
				vo.setWriter(rs.getString("writer"));	
				vo.setEmail(rs.getString("email"));
				vo.setSubject(rs.getString("subject"));
				vo.setPasswd(rs.getString("passwd"));
				vo.setReg_date(rs.getTimestamp("reg_date"));
				vo.setReadcount(rs.getInt("readcount"));
				vo.setRef(rs.getInt("ref"));
				vo.setRe_level(rs.getInt("re_level"));
				vo.setRe_step(rs.getInt("re_step"));
				vo.setIp(rs.getString("ip"));
				vo.setContent(rs.getString("content"));
			} // if end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}				
		return vo;
	} // update(num) end
	
	//update(vo) - �ۼ����� ó�� �޼ҵ� <=== updatePro.jsp ���� ���
	public int update(BoardVO vo) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String dbpasswd = "";
		String sql = "";
		int result = -1;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT PASSWD FROM BOARD WHERE NUM = ?");
			pstmt.setInt(1, vo.getNum());
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				dbpasswd = rs.getString("passwd");
				
				if( dbpasswd.equals(vo.getPasswd())) {
					sql = "UPDATE BOARD SET WRITER=?, EMAIL=?, SUBJECT=?, PASSWD=? ";
					sql += " ,CONTENT = ? WHERE NUM = ?";
					
					System.out.println(sql);
					
					pstmt = conn.prepareStatement(sql);
					
					pstmt.setString(1, vo.getWriter());
					pstmt.setString(2, vo.getEmail());
					pstmt.setString(3, vo.getSubject());
					pstmt.setString(4, vo.getPasswd());
					pstmt.setString(5, vo.getContent());
					pstmt.setInt(6, vo.getNum());
					
					pstmt.executeUpdate();
					result = 1;
					
				} else {
					result = 0;
				} // in if end
			} // out if end
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}					
		return result;
	} // update() end	
	
	//delete( num, passwd ) - deletePro.jsp
	public int delete(int num, String passwd) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		
		String dbpasswd = "";
		int result = 0;
		
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("SELECT PASSWD FROM BOARD WHERE NUM=?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();
			
			if( rs.next() ) {
				dbpasswd = rs.getString("passwd");
				
				if( dbpasswd.equals(passwd) ) {
					pstmt = conn.prepareStatement("DELETE FROM BOARD WHERE NUM = ?");
					pstmt.setInt(1, num);
					result = pstmt.executeUpdate();
					result = 1;   // �ۻ��� ����
					
				} else 	result = 0;  // ��й�ȣ Ʋ��
			} // out if end	
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			CloseUtil.close(rs);			CloseUtil.close(pstmt);			CloseUtil.close(conn);
		}					
		return result;
	} // delete() end
}








