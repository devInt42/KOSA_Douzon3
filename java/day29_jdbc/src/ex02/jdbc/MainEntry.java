package ex02.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class MainEntry {
	// select All
	static Scanner sc = new Scanner(System.in);

	static void selectAll(Connection conn) throws SQLException {
		String sql = "SELECT * FROM GIFT";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery(sql);
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			int gno = rs.getInt(1);
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		rs.close();
		pstmt.close();
	}

	// selectGno
	static void selectGno(Connection conn) throws SQLException {
		System.out.println("상품번호를 입력하세요 : ");
		int gno = sc.nextInt();
		String sql = "SELECT * FROM GIFT WHERE GNO =" + gno;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		ResultSet rs = pstmt.executeQuery(sql);
		System.out.println("상품번호\t상품명\t최저가\t최고가");
		while (rs.next()) {
			String gname = rs.getString(2);
			int g_s = rs.getInt(3);
			int g_e = rs.getInt(4);
			System.out.println(gno + "\t" + gname + "\t" + g_s + "\t" + g_e);
		}
		rs.close();
		pstmt.close();
	}

	// insert
	static void Insert(Connection conn) throws SQLException {
		System.out.println("Gift Table data input : 상품번호/상품명/최저가/최고가 = ");
		String sql = "INSERT INTO GIFT VALUES( ?, ?, ?, ? )";
		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, sc.nextInt());
		pstmt.setString(2, sc.next());
		pstmt.setInt(3, sc.nextInt());
		pstmt.setInt(4, sc.nextInt());
		int result = pstmt.executeUpdate(); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result + " 개 데이터 추가 성공함");
		
		pstmt.close();
	}
	// delete
	static void Delete(Connection conn) throws SQLException {
		System.out.println("삭제 제품의 상품 번호를 입력해주세요 ");
		int gno = sc.nextInt();
		String sql = "DELETE GIFT WHERE gno =" +gno;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate(sql); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result + " 개 데이터 삭제 성공함");
		
		pstmt.close();
	}
	
	// update
	static void Update(Connection conn) throws SQLException {
		System.out.println("수정할 제품의 상품 번호, 상품명, 최저가, 최고가 입력 : ");
		int gno = sc.nextInt();
		String gname = sc.next();
		int g_start = sc.nextInt();
		int g_end = sc.nextInt();
		String sql = "UPDATE GIFT SET "+"gname = '"+gname +"' , g_start = '" + g_start +"' , g_end = '" + g_end+"' WHERE GNO = "+gno;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		int result = pstmt.executeUpdate(sql); // 반환값이 없는 경우 - insert, update, delete

		System.out.println(result + " 개 데이터 수정 성공함");
		pstmt.close();
	}


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
		while (true) {
			System.out.println("\n===========================================================================\n");
			System.out.println("1. 테이블 전체 출력 \t 2. 상품 번호 검색 \t 3. 상품 추가 \t 4. 상품 삭제 \t 5. 상품 수정 \t 6. 종료");
			int num = sc.nextInt();
			if (num == 1)
				selectAll(conn);
			else if (num == 2)
				selectGno(conn);
			else if (num == 3)
				Insert(conn);
				else if (num == 4)
					Delete(conn);
			else if (num == 5)
				Update(conn);
			else if (num == 6) {
				System.out.println("종료");
				conn.close();
				break;
			} else
				;
		}
	}
}
