package dbConn.util;
/*
    DB ?—°ê²? ? •ë³? ë°˜ë³µ? ?œ¼ë¡? ì½”ë”© ?•´ê²?
    ?‹¤ë¥? ?´?ž˜?Š¤?—?„œ ?•„?ž˜ ì½”ë“œ êµ¬í˜„?„ ?•˜ì§? ?•Š?„ë¡? ?„¤ê³?
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kingsmile", "oracle"); 
    
    ?´?Ÿ°?‹?œ¼ë¡? ?‚¬?š©
    ConnectionHelper.getConnection("mysql") or ("oracle"),....
    dsn ==> data source name      
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	// ?•¨?ˆ˜(? ‘ê·¼ìž :  public, static )
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
		System.out.println("\t 1. ? ˆì½”ë“œ ?‚½?ž…(ì¶”ê?) ");
		System.out.println("\t 2. ? ˆì½”ë“œ ?ˆ˜? • ");
		System.out.println("\t 3. ? „ì²´ë³´ê¸? ");
		System.out.println("\t 4. ì¡°ê±´?— ?˜?•œ ê²??ƒ‰(ex>gno ) ");
		System.out.println("\t 5. ? ˆì½”ë“œ ?‚­? œ ");
		System.out.println("\t 6. ?”„ë¡œê·¸?ž¨ ì¢…ë£Œ ");
		System.out.println("\t 9. commit ");
		System.out.println("\t >> ?›?•˜?Š” ë©”ë‰´ ?„ ?ƒ ?•˜?„¸?š”.  ");
	}
	
}








