package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.regex.Pattern;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;
import model.CustomerVO;
import view.Market;
import controller.ParentsController;

public class LoginController extends ParentsController {
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static String rCNO = null;
	
	

	public static void LoginMenuList() {	
		System.out.println("\n-=-=-=-= 로그인-=-=-=-=-\n");

		System.out.println("\t 0. 롤백한다 ");
		System.out.println("\t 1. 회원가입 ");
		System.out.println("\t 2. 로그인 ");

		System.out.println("\t 3. 프로그램 종료 ");
		System.out.println("\t 4. 커밋 ");

		System.out.println("\n-=-=-=-=-=-=-=-=-=-=-=-\n");
		System.out.println(">> 원하는 메뉴 선택하세요.  ");
	}

	public static String menu() throws SQLException {
		CustomerVO vo = new CustomerVO();

		a: while (true) {
			System.out.println("\t 0. 취소 (rollback) ");
			System.out.println("\t 5. commit ");

			LoginMenuList();

			switch (sc.nextInt()) {
			case 0:
				System.out.println("commit 하시겠습니까?(Y/N)");
				System.out.println("안하시면 롤백됩니다.");
				if (sc.next().equalsIgnoreCase("Y")) {
					commit();

				} else {
					rollback();

				}
				break;
			case 1:
				signup(vo.getClassName());

				rCNO = login(vo.getClassName());
				if (rCNO != null) {
					break a;
				}
				break;
			case 2:
				rCNO = login(vo.getClassName());
				if (rCNO != null) {
					break a;
				}
				break;
			case 3:
				close();
				System.out.println("로그인 프로그램 종료합니다!");
				System.exit(0);
				break;
			case 4:
				commit();
				System.out.println("성공적으로 완료 되었습니다.");
				break;
			default:
				System.out.println("없는 번호입니다.0~4까지 수를 입력하세요 ");
				continue;
			}
		}
		return rCNO;
	}

	public static void signup(String className) throws SQLException { // 1. 회원가입 
		System.out.println("insert recode");
		String CID;
		a: while (true) {
			System.out.println("아이디를 입력하시오. 영문자, 숫자가 각 1개 이상 포함된 8~16자리");
			CID = sc.next();
			;
			String pattern = "^(?=.*[a-zA-z])(?=.*[0-9]).{8,16}$";
			boolean regex = Pattern.matches(pattern, CID);
			if (!regex) {
				System.out.println("아이디가 조건에 맞지 않습니다. 다시입력하시겠습니까?(Y/N)");
				String ans = sc.next();
				if (!ans.equalsIgnoreCase("Y")) {

					rollback();
					System.out.println("취소(롤백)했습니다");
					break a;
				} else {
					continue;
				}
			}
			b: while (true) {

				pstmt = conn.prepareStatement("SELECT CID FROM " + className + " WHERE CID = ?");
				pstmt.setString(1, CID);

				int result = pstmt.executeUpdate();
				if (result < 1) {
					break;
				} else {
					System.out.print("는 중복된 아이디입니다. 다시입력하시오.");
				}
			}

			pstmt = conn.prepareStatement("INSERT INTO " + className + " VALUES(SEQ_CNO.NEXTVAL, ?,?,?,?,?, NULL)");
			pstmt.setString(1, CID);
			System.out.println("이름 입력");
			pstmt.setString(2, sc.next());
			String PWD;
			c: while (true) {
				System.out.println("비밀번호 입력.영문자, 숫자,특수문자가 각 1개 이상 포함된 8~16자리");
				PWD = sc.next();
				String pattern2 = "^(?=.*[a-zA-z])(?=.*[0-9])(?=.*[$`~!@$!%*#^?&\\\\(\\\\)\\-_=+]).{8,16}$";
				boolean regex2 = Pattern.matches(pattern2, PWD);
				if (!regex2) {
					System.out.println("비밀번호가 조건에 맞지 않습니다. 다시입력하시겠습니까?(Y/N)");
					String ans = sc.next();
					if (!ans.equalsIgnoreCase("Y")) {

						rollback();
						System.out.println("취소(롤백)했습니다");
						break a;
					} else {
						continue;
					}
				} else
					break c;
			}
			pstmt.setString(3, PWD);
			System.out.println("주소 입력");
			pstmt.setString(4, sc.next());
			System.out.println("전화번호 입력");
			pstmt.setString(5, sc.next());

			int result = pstmt.executeUpdate();
			System.out.println(result + "개 데이터 추가 성공함");

			System.out.println("저장하시겠습니까?(Y/N)");
			if (sc.next().equalsIgnoreCase("Y")) {
				commit(); // 예외발생
				System.out.println("회원 추가 성공");

				break a;
			} else {
				rollback();
				System.out.println("취소(롤백)했습니다");
				break a;
			}

		}

	}

	public static String login(String className) throws SQLException { //2. 로그인
		// 로그인
		String CID;
		String PWD;
		String rPWD = null;
		String rCID = null;

		a: while (true) {
			System.out.println("아이디를 입력하시오");
			CID = sc.next();
			// Pattern pattern = Pattern.compile("^[A-Za-z0-9]+$");

			String sql = "SELECT * FROM " + className + " WHERE CID = " + "'" + CID + "'";

			// ResultSet 객체를 이용해, SELECT문의 결과를 순회하여 원하는 값만 뽑아오거나 출력할 수 있습니다.
			ParentsController.connect();
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {

				rCID = rs.getString("CID");

			}

			if (rCID != null) {// 비번입력
				while (true) {

					System.out.println("비밀번호 입력하시오");
					PWD = sc.next();
					sql = "SELECT * FROM " + className + " WHERE CID = '" + CID + "'";
					stmt = conn.createStatement();
					rs = stmt.executeQuery(sql);
					while (rs.next()) {

						rPWD = rs.getString("PWD");

					}
					if (rPWD.equals(PWD)) {
						System.out.println("로그인 성공!!");
						sql = "SELECT * FROM " + className + " WHERE CID = '" + CID + "'";
						stmt = conn.createStatement();
						rs = stmt.executeQuery(sql);
						while (rs.next()) {
							rCNO = rs.getString("CNO");
						}

						break a;

					} else
						System.out.println("비밀번호 틀립니다. 다시 입력하시겠습니까? (Y/N)");
					if (sc.next().equalsIgnoreCase("Y")) {

					} else {
						conn.rollback();
						System.out.println("롤백했습니다");
						break;
					}
				}
				break;
			} else {
				System.out.print("는 등록되지 않은 아이디입니다. 다시입력하시겠습니까?(Y/N)");
				if (sc.next().equalsIgnoreCase("Y")) {

				} else {
					conn.rollback();
					System.out.println("롤백했습니다");
					break;
				}
			}
		}
		return rCNO;

	}
}
