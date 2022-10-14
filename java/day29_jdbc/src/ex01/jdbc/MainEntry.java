package ex01.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MainEntry {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//1. driver load ..... exception 발생
//		Class.forName("oracle.jdbc.driver.OracleDriver"); //생략 가능
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");
		
		//2. Connection & Open
		//driver : @ IP : ProtNumber : SID(or 전역 데이터 베이스명)
		String url = "jdbc:oracle:thin:@192.168.110.22:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		System.out.println("connection success!!");
		
		//3. 사용(DML 명령어 주로 사용)
		
		//4. 닫기 closer;
		
	}
	
	// SQL, 
}
