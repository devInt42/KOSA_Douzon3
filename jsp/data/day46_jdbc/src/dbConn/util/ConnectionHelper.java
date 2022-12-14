package dbConn.util;
/*
    DB ?°κ²? ? λ³? λ°λ³΅? ?Όλ‘? μ½λ© ?΄κ²?
    ?€λ₯? ?΄??€?? ?? μ½λ κ΅¬ν? ?μ§? ??λ‘? ?€κ³?
    
    Class.forName("oracle.jdbc.OracleDriver");
    Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","kingsmile", "oracle"); 
    
    ?΄?°??Όλ‘? ?¬?©
    ConnectionHelper.getConnection("mysql") or ("oracle"),....
    dsn ==> data source name      
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionHelper {
	// ?¨?(? κ·Όμ :  public, static )
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
		System.out.println("\t 1. ? μ½λ ?½?(μΆκ?) ");
		System.out.println("\t 2. ? μ½λ ??  ");
		System.out.println("\t 3. ? μ²΄λ³΄κΈ? ");
		System.out.println("\t 4. μ‘°κ±΄? ?? κ²??(ex>gno ) ");
		System.out.println("\t 5. ? μ½λ ?­?  ");
		System.out.println("\t 6. ?λ‘κ·Έ?¨ μ’λ£ ");
		System.out.println("\t 9. commit ");
		System.out.println("\t >> ??? λ©λ΄ ? ? ??Έ?.  ");
	}
	
}








