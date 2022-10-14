package dbConn.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionSingletonHelper {
	private static Connection conn;

	private ConnectionSingletonHelper() {
	}

	public static Connection getConnection(String dsn) {
		if (conn != null) {
			return conn;
		}

		try {
			if (dsn.equals("mysql")) {
				Class.forName("oracle.jdbc.OracleDriver");
				conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver", "int42", "mysql");

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

	public static void close() throws SQLException {
		if (conn != null) {
			if (!conn.isClosed()) {
				conn.close();
			}
		}
	}
}
