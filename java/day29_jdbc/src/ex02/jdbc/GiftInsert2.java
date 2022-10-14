package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert2 {
	public static void main(String[] args) 
			throws ClassNotFoundException, SQLException {  // 예외처리 위임
		//1. Driver load...... exception
		Class.forName("oracle.jdbc.OracleDriver");   // 예외발생
		//2. Connection & Open
		String url = "jdbc:oracle:thin:@192.168.110.22:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		//3. 사용 (DML - Insert )
				String sql = "INSERT INTO GIFT VALUES( ?, ?, ?, ? )" ;
				PreparedStatement  pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, 20);
				pstmt.setString(2, "초코렛");
				pstmt.setInt(3, 200);
				pstmt.setInt(4,3000);
				int result = pstmt.executeUpdate();  // 반환값이 없는 경우 - insert, update, delete
				
				System.out.println(result + " 개 데이터 추가 성공함");
		//4. 닫기(자원 반환)
		pstmt.close();		conn.close();
	}

}











