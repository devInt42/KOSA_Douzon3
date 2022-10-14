package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;

/*
   DB연결 정보 반복적으로 코딩 해결
   다른 클래스에서 아래 코드 구현을 하지 않도록 설계
   Class.forName("oracle.jdbc.OracleDriver");
   Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Oracle/wallet", "bob", "xxxxxxAt22cc");
 
    이런식으로 사용
    ConnectionHelper.getConnection("mysql") or ("oracle"),...
    dsn ==> data source name
    
 */
public class ConnectionHelper {
	// 함수(접근자 : public, static)
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver","int42", "mysql");

			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Oracle/Wallet_edudb",
						"int42", "Frenzy4236!!");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;

		}
	}

	// 함수(접근자 : public, static)
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if (dsn.equals("mysql")) {
				Class.forName("com.mysql.jdbc.Driver");
				conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver","int42", "mysql");

			} else if (dsn.equals("oracle")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Oracle/Wallet_edudb",
						"int42", "Frenzy4236!!");

			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;

		}

	}

}