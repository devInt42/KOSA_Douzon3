package edu.kosa.dao_di;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "oracle";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		return conn;
	}

}
