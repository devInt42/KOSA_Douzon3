package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class ItemController {
   static Scanner sc = new Scanner(System.in);
   static Statement stmt = null;
   static ResultSet rs = null;
   static Connection conn = null;
   static PreparedStatement pstmt = null;
   static String CNO = null;

   public static void selectAll(String cno) throws SQLException { // Select All

      connect();
      CNO = cno;
      while (true) {
         System.out.println("1. 전체 보기 \t 2. 상품명 검색 \t 3.판매자 검색 \t 4. 가격 범위 설정 \t 5. 이전 메뉴로 돌아가기");
         switch (sc.nextInt()) {
         case 1:
            rs = stmt.executeQuery("SELECT *FROM V_ITEMLIST"); // 반환값 있는 경우
            break;
         case 2:
            System.out.println("상품명을 입력해주세요 : ");
            String i_name = sc.next();
            rs = stmt.executeQuery("SELECT *FROM V_ITEMLIST WHERE INAME  LIKE  '%" + i_name + "%'"); // 반환값 있는 경우
            break;
         case 3:
            System.out.println("판매자명을 입력해주세요 : ");
            String c_name = sc.next();
            rs = stmt.executeQuery("SELECT *FROM V_ITEMLIST WHERE CNAME  LIKE  '%" + c_name + "%'"); // 반환값 있는 경우
            break;
         case 4:
            System.out.println("최소값을 입력해주세요 : ");
            int min = sc.nextInt();
            System.out.println("최대값을 입력해주세요 : ");
            int max = sc.nextInt();
            if (min > max) { // 값을 잘못 입력했을 경우
               int tmp = min;
               min = max;
               max = tmp;
            }
            rs = stmt.executeQuery(
                  "SELECT *FROM V_ITEMLIST WHERE IPRICE BETWEEN " + min + " AND " + max + " ORDER BY IPRICE");
            break;
         case 5:
            MarketController.menu();
            break;
         default:
            System.out.println("1~4중에서 입력하세요");
            break;
         }
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
   }

   public static void insert(String cno) throws SQLException { // 판매 물품 등록

      CNO = cno;
      System.out.println("회원번호 : " + CNO);
      System.out.print("상품명 : ");
      String iname = sc.next();
      System.out.print("상품 가격 : ");
      String iprice = sc.next();

      try {
         connect();
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
            commit(); // 예외발생
            System.out.println("물품 등록 성공");
         } else {
            rollback();
            System.out.println("취소(롤백)했습니다");
         }

      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // connect
   public static void connect() {
      try {
         conn = ConnectionHelper.getConnection("oracle");
         stmt = conn.createStatement();
         conn.setAutoCommit(false); // 자동커밋 끄기
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // close
   public static void close() {
      try {
         CloseHelper.close(rs);
         CloseHelper.close(stmt);
         CloseHelper.close(pstmt);
         CloseHelper.close(conn);
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

   // rollback
   public static void rollback() throws SQLException {
      conn.rollback();
      System.out.println("롤백성공");
   }

   // commit
   public static void commit() throws SQLException {
      conn.commit();
      System.out.println("커밋성공");
   }
}