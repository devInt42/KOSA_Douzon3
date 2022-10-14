package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftInsert {
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
		Statement stmt = conn.createStatement();
		//insert into gift values(11, '종합과자', 1000, 20000);
		//String sql = "INSERT INTO GIFT VALUES(12, '스팸2', 3000, 5000)" ;
		String sql = "INSERT INTO GIFT VALUES(" + args[0]+ ", ' " + args[1]+" ', " +args[2]+ ", "+ args[3]+ " )" ;
		System.out.println(sql);  //   출력해서 확인
		int result = stmt.executeUpdate(sql);
		System.out.println(result + " 개 데이터 추가 성공함");
		
		//4. 닫기(자원 반환)
		stmt.close();		conn.close();
	}

}











