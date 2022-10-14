package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class GiftSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 1. driver load ..... exception 발생
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("driver load success!!");

		// 2. Connection & Open
		// driver : @ IP : ProtNumber : SID(or 전역 데이터 베이스명)
		String url = "jdbc:oracle:thin:@192.168.110.22:1521:orcl";
		String uid = "system";
		String pwd = "oracle";

		Connection conn = DriverManager.getConnection(url, uid, pwd);

		// 3. 사용(DML 명령어 주로 사용)
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery("SELECT * FROM GIFT");
			System.out.println("상품번호\t상품명\t최저가\t최고가");
			while (rs.next()) {
					int gno = rs.getInt(1);
					String gname = rs.getString(2);
					int g_s = rs.getInt(3);
					int g_e = rs.getInt(4);
					System.out.println(gno + "\t" +gname + "\t" + g_s + "\t"+g_e);
			}
		
		// 4. 닫기 closer;
			rs.close();
			stmt.close();
			conn.close();
	
	}

}
