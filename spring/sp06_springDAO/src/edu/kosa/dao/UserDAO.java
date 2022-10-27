package edu.kosa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import edu.kosa.model.UserVO;

public abstract class UserDAO { // �߻� Ŭ����

	// DB ���� ���� �޼ҵ�
	public abstract Connection getConnection() throws Exception; // �߻� �޼ҵ�

	// 3. ���.(DML ��ɾ�)
	// insert

	public void insert(UserVO user) throws Exception {
		Connection conn = getConnection();
		String sql = "INSERT INTO USERS(ID, NAME, PASSWORD) VALUES (?, ?, ?)";
		PreparedStatement pstmt = conn.prepareStatement(sql);

		pstmt.setString(1, user.getId());
		pstmt.setString(2, user.getName());
		pstmt.setString(3, user.getPassword());
		int result = pstmt.executeUpdate();
		System.out.println(result + " �� �Է� ����");

		pstmt.close();
		conn.close();

	}

	// selectById
	public void selectById(String uid) throws Exception {
		Connection conn = getConnection();
		String sql = "SELECT * FROM USERS WHERE ID = '" + uid + "'";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery();
		System.out.println("======Select=======");
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String pass = rs.getString("password");
			System.out.println("���̵� : " + id + "\n" + "�̸� : " + name + "\n" + "��й�ȣ : " + pass + "\n");
		}	

	}

	// selectAll
	public void selectAll() throws Exception {
		Connection conn = getConnection();
		String sql = "SELECT * FROM USERS";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		System.out.println("======SelectAll=======");
		while (rs.next()) {
			String id = rs.getString("id");
			String name = rs.getString("name");
			String pass = rs.getString("password");
			System.out.println("���̵� : " + id + "\n" + "�̸� : " + name + "\n" + "��й�ȣ : " + pass + "\n");
		}

		stmt.close();
		conn.close();
	}
	// update

	// delete

	// menu
	public void menu() {
		System.out.println("�����ϼ��� : \n 1. insert");
		System.out.println("2. selectById \n 3. selectAll \n 4. update \n 5. delete");
	}

}
