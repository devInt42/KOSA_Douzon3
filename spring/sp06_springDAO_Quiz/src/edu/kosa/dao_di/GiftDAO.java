package edu.kosa.dao_di;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kosa.model.GiftVO;

public class GiftDAO {
    // has-a 관계
	@Autowired
	private ConnectionMaker connectionMaker;
	
	
	
	public GiftDAO(ConnectionMaker connectionMaker) {   //  DI
		this.connectionMaker = connectionMaker;
	}
	
	public GiftDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void setConnectionMaker(ConnectionMaker connectionMaker) {   // DI
		this.connectionMaker = connectionMaker;
	}



	// 3. 사용(DML 명령어)
	//selectAll
	public void selectAll() throws Exception {
		Connection conn = connectionMaker.makeConnection();
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
		
		while(rs.next()) {
			int gno = rs.getInt("gno");
			String gname = rs.getString("gname");
			int g_start = rs.getInt("g_start");
			int g_end = rs.getInt("g_end");
			System.out.println("gno : " + gno);
			System.out.println("gname : "+ gname);
			System.out.println("g_start : "+ g_start);
			System.out.println("g_end : " + g_end+ "\n");
		
		
		}
		
	}
	
	/*	// insert
		public void insert(GiftVO vo) throws Exception {
			Connection conn = connectionMaker.makeConnection(); // db connect
			
			String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES(?, ?, ?)";
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, vo.getId());
			pstmt.setString(2, vo.getName());
			pstmt.setString(3, vo.getPassword());
			int result = pstmt.executeUpdate();
			System.out.println(result + " 개 입력 성공!!! connectionMaker ");
			 
			pstmt.close();
			conn.close();
		}
		
		public void menu() {
			System.out.println("선택하세요: \n1.insert ");
			System.out.println("2.selectById \n3.selectAll\n4.update\n5.delete");
		}
	*/
}
