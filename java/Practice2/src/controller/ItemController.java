package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.CustomerVO;

public class ItemController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static String CNO = null;

	public static void selectAll(String cno) throws SQLException { // Select All

		ParentsController.connect();
		CNO = cno;
		rs = stmt.executeQuery("SELECT *FROM V_ITEMLIST"); // 반환값 있는 경우

		while (rs.next()) {
			int ino = rs.getInt(1);
			System.out.println("상품번호\t :  " + ino);
			String iname = rs.getString(2);
			System.out.println("상품이름\t :  " + iname);
			String iprice = rs.getString(3);
			System.out.println("상품가격\t :  " + iprice);
			String cname = rs.getString(4);
			System.out.println("판매자 \t :  " + cname);
			String chat = rs.getString(5);
			System.out.println("채팅방 \t :  " + chat);
			System.out.println();
		} // end while
	}

	public static void insert(String cno) throws SQLException { // 판매 물품 등록

		CNO = cno;
		System.out.println("회원번호 : " + CNO);
		System.out.print("상품명 : ");
		String iname = sc.next();
		System.out.print("상품 가격 : ");
		String iprice = sc.next();

		try {
			ParentsController.connect();
			pstmt = conn.prepareStatement("INSERT INTO ITEM VALUES( SEQ_INO.NEXTVAL, ?, ?, ?, ?, ?)");
			pstmt.setString(1, iname); // 상품명
			pstmt.setString(2, iprice); // 상품가격
			pstmt.setString(3, CNO); // 판매자 번호
			pstmt.setString(4, "OFF");
			pstmt.setString(5, "OFF");
			int result = pstmt.executeUpdate();

			System.out.println(result + "개 데이터가 추가 되었습니다.");
			System.out.println("저장하시겠습니까?(Y/N)");
			if (sc.next().equalsIgnoreCase("Y")) {
				ParentsController.commit(); // 예외발생
				System.out.println("물품 등록 성공");
			} else {
				ParentsController.rollback();
				System.out.println("취소(롤백)했습니다");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
}
