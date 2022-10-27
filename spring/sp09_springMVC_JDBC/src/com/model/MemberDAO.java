package com.model;

import java.sql.SQLException;

public interface MemberDAO {

	
	//ȸ�� �� ��ȸ
	MemberVO selectMemberById(String id) throws SQLException;
	
	//ȸ�� ������ �Ǵ��ϴ� ��ȸ �׽�Ʈ
	boolean memberCheck(String id, String pwd) throws SQLException;
	
	boolean memberInsert(String id, String name, String pwd, String email, int age) throws SQLException;
}
