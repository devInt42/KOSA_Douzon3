package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class GiftUpdate {
	public static void main(String[] args) throws ClassNotFoundException, SQLException { // 예외처리 위임
		Scanner sc = new Scanner(System.in);
		// 1. Driver load...... exception
		Class.forName("oracle.jdbc.OracleDriver"); // 예외발생
		// 2. Connection & Open
		String url = "jdbc:oracle:thin:@192.168.110.22:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		Connection conn = DriverManager.getConnection(url, uid, pwd);

		// 3. 사용 (DML - Insert )
		System.out.println("수정할 제품의 상품 번호, 상품명, 최저가, 최고가 입력 : ");
		int gno = sc.nextInt();
		String gname = sc.next();
		int g_start = sc.nextInt();
		int g_end = sc.nextInt();
		String sql = "UPDATE GIFT SET "+"gname = '"+gname +"' , g_start = '" + g_start +"' , g_end = '" + g_end+"' WHERE GNO = "+gno;
		Statement stmt = conn.createStatement();
		int result = stmt.executeUpdate(sql); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result + " 개 데이터 수정 성공함");

		// 4. 닫기(자원 반환)
		stmt.close();
		conn.close();
	}
}
