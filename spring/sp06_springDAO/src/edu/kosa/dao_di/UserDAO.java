package edu.kosa.dao_di;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.springframework.beans.factory.annotation.Autowired;

import edu.kosa.model.UserVO;

public class UserDAO {
    // has-a 관계
	@Autowired
	private ConnectionMaker connectionMaker;
	
	
	
	public UserDAO(ConnectionMaker connectionMaker) {   //  DI
		this.connectionMaker = connectionMaker;
	}
	
	public UserDAO() {
		// TODO Auto-generated constructor stub
	}
	
	public void setConnectionMaker(ConnectionMaker connectionMaker) {   // DI
		this.connectionMaker = connectionMaker;
	}



	// 3. 사용(DML 명령어)
	// insert
	public void insert(UserVO vo) throws Exception {
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

}
