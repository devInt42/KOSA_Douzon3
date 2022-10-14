package dbConn.util;
/*
    DB ?���? ?���? 반복?��?���? 코딩 ?���?
    ?���? ?��?��?��?��?�� ?��?�� 코드 구현?�� ?���? ?��?���? ?���?
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kingsmile", "oracle"); 
    
    ?��?��?��?���? ?��?��
    ConnectionHelper.getConnection("mysql") or ("oracle"),....
    dsn ==> data source name      
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	// ?��?��(?��근자 :  public, static )
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
			    conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver","kingsmile", "mysql"); 
			    
			} else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
				 conn = DriverManager.getConnection("jdbc:oracle:thin:@edudb_high?TNS_ADMIN=C:/Oracle/Wallet_edudb",
						"int42", "Frenzy4236!!");			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;	
		}
	}
	
	public static Connection getConnection(String dsn, String userid, String pwd) {
		Connection conn = null;
		try {
			if( dsn.equals("mysql") ) {
				Class.forName("com.mysql.jdbc.Driver");
			    conn = DriverManager.getConnection("org.gjt.mm.mysql.Driver", userid, pwd); 
			    
			} else if( dsn.equals("oracle") ) {
				Class.forName("oracle.jdbc.OracleDriver");
			    conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl",userid, pwd); 
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			return conn;	
		}
	}
	
	public static void menu() {
		System.out.println("\n-=-=-=-=-= JDBC Query =-=-=-=-=-");
		System.out.println("\t 0. rollback ");
		System.out.println("\t 1. ?��코드 ?��?��(추�?) ");
		System.out.println("\t 2. ?��코드 ?��?�� ");
		System.out.println("\t 3. ?��체보�? ");
		System.out.println("\t 4. 조건?�� ?��?�� �??��(ex>gno ) ");
		System.out.println("\t 5. ?��코드 ?��?�� ");
		System.out.println("\t 6. ?��로그?�� 종료 ");
		System.out.println("\t 9. commit ");
		System.out.println("\t >> ?��?��?�� 메뉴 ?��?�� ?��?��?��.  ");
	}
	
}








