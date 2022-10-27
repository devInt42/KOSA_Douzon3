package edu.kosa.dao_di;

import java.sql.Connection;
import java.sql.DriverManager;

public class LConnectionMakerImpl implements ConnectionMaker {

	@Override
	public Connection makeConnection() throws Exception {
		Class.forName("mysql");
		String url="mysql";
		String uid = "kingsmile";
		String pwd = "mysql";
		
		Connection conn = DriverManager.getConnection(url, uid, pwd);
		
		return conn;
	}

}
