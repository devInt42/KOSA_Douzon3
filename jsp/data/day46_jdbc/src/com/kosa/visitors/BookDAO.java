package com.kosa.visitors;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class BookDAO {   // Controller

		// connection & open
		public static Connection  loadOracleDriver() {
			Connection conn = null;
			
			try {
				conn = ConnectionHelper.getConnection("oracle");
			} catch (Exception e) {
				e.printStackTrace();
			}
			return conn;
		}

		//��ü ���ڵ� �� ���ؼ� ������ ī��Ʈ �ϴ� �Լ� ,  conn,   5
	  public static int getPageCount(Connection conn, int numPerPage) 
				throws SQLException {   //����ó�� ����
			
			String sql = "SELECT COUNT(*) FROM GUESTBOOK " ;   //20
			Statement  stmt = conn.createStatement();
			ResultSet  rs = stmt.executeQuery(sql);
			int max = 0;
			
			while( rs.next() ) {
				max = rs.getInt(1);  // 20
				break;
			} // while end
			
			CloseHelper.close(stmt);
			int pageCount = (int)Math.ceil( (double)max / numPerPage );  //   20 / 5 = 4
			
			pageCount = Math.max(pageCount, 1);  // max(4, 1);
			
			return pageCount;
		} //getPageCount() end
	
	  // select all 
	  public static Vector<BookVO> selectAll(Connection conn, int mypage, int numPerPage)
	  					throws SQLException	{
		  
		  StringBuffer sb = new StringBuffer();
		  int start = (mypage - 1) * numPerPage;
		  int end = mypage * numPerPage;
		  
		  sb.append("SELECT NUM, NAME, EMAIL, HOME, CONTENTS FROM GUESTBOOK ");
	      sb.append(" WHERE NUM > ? AND NUM <= ? ");
	      sb.append(" ORDER BY NUM DESC");
		  
		  PreparedStatement pstmt = conn.prepareStatement(sb.toString());
		  pstmt.setInt(1, start);
		  pstmt.setInt(2, end);
		  ResultSet rs = pstmt.executeQuery();  //
		  
		  Vector<BookVO> data = new Vector<BookVO>();
		  
		  while( rs.next() ) {
			  BookVO vo = new BookVO();
			  vo.setName(rs.getString("name"));
			  vo.setNum(rs.getInt("num"));
			  vo.setEmail(rs.getString("email"));
			  vo.setHome(rs.getString("home"));
			  vo.setContents(rs.getString("contents"));
			  
			  data.add(vo);
		  } // end while
		  CloseHelper.close(rs);		  CloseHelper.close(pstmt);
		  return data;
	  }  // selectAll() end
	
	  // update
	
	  // delete
	
}




