package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class MarketController {
   // 연결, 삽입, 삭제, 수정, 검색,......
   static Scanner sc = new Scanner(System.in);
   static Statement stmt = null;
   static ResultSet rs = null;
   static Connection conn = null;
   static PreparedStatement pstmt = null;
   static PreparedStatement pstmt2 = null;
   static String CNO = null;
   static int CMANAGER;
   static int INO;

   public static String login() throws SQLException {
      CNO = LoginController.menu();
      return CNO;
   }

   public static void menuList() {	
      System.out.println("\n======= 떡잎 마켓=======\n");
      System.out.println("\t 1. 물품 목록 ");
      System.out.println("\t 2. 판매 물품 등록");
      System.out.println("\t 3. 채팅하기 ");
      System.out.println("\t 4. 구매확정하기 ");
      System.out.println("\t 5. 사용자 정보 ");
      System.out.println("\t 6. 프로그램 종료 ");

      if (CMANAGER == 1) {
         System.out.println("\n======= 관리자 ========\n");
         System.out.println("\t 7. 회원 관리 ");

      }
      System.out.println("\n=====================");

      System.out.print(">> 원하는 메뉴 선택하세요  : ");
   }

   // menu
   public static void menu() throws SQLException { // 예외처리 위임
      connect();
      if (CNO == null) { // 로그인이 안되있을경우 로그인
         CNO = login();
      }

      rs = stmt.executeQuery("SELECT CMANAGER FROM CUSTOMER WHERE CNO = " + CNO); // 반환값 있는 경우
      while (rs.next()) {
         CMANAGER = rs.getInt(1);
      }
      while (true) {
         System.out.println();
         menuList();
         switch (sc.nextInt()) {
         case 0:
            System.out.println("Commit 하시겠습니까?(Y/N) ");
            System.out.println("안하시려면 Rollback 됩니다. ");
            if (sc.next().equalsIgnoreCase("Y")) {
               conn.commit(); // 예외발생
            } else {
               conn.rollback();
            }
            break;

         case 1:
            ItemController.selectAll(CNO);
            break;
         case 2:
            ItemController.insert(CNO);
            break;
         case 3:
            chatStart(CNO);
            break;
         case 4:
            buyConfirm(CNO);
            break;
         case 5:
            UserInfoController.menu(CNO);
            break;
         case 6:
            close();
            System.out.println("프로그램 종료합니다!");
            System.exit(0);
            break;
         case 7:
            if (CMANAGER != 1) {
               break;
            }
            ManagerController.menu(CNO, CMANAGER);
            break;
         default:
            System.out.println("1~6중에서 입력하세요");
            break;
         }
      }
   } // end menu

   public static void selectSellList() throws SQLException {
      pstmt = conn.prepareStatement("SELECT * FROM ITEM ");

      rs = pstmt.executeQuery();
      System.out.println("상품번호\t상품이름\t상품가격\t판매자\n");

      while (rs.next()) {

         int ino = rs.getInt(1);
         String iname = rs.getString(2);
         String iprice = rs.getString(3);
         String Seller_CNO = rs.getString(4);
         String chat = rs.getString(5);
         System.out.println(ino + "\t" + iname + "\t" + iprice + "\t" + Seller_CNO);
         System.out.println();

      } // end while

   }

   private static void chatStart(String CNO) throws NumberFormatException, SQLException { //3. 채팅하기
      while (true) {
         selectSellList();

         System.out.println("구매의사가 있는 상품의 상품번호를 입력하세요.");
         INO = sc.nextInt();

         pstmt = conn.prepareStatement("SELECT * FROM ITEM WHERE INO = ?");
         pstmt.setInt(1, INO);
         int result = pstmt.executeUpdate();
         if (result == 0) {
            System.out.println("잘못된 상품번호입니다. 다시 입력하세요");
         } else
            break;
      }
      new Chat();
      Chat.start(INO, Integer.parseInt(CNO));
   }

   public static void buyConfirm(String CNO) throws SQLException { //  4. 구매확정하기 
      while (true) {
      selectSellList();
      
      System.out.println("구매의사가 있는 상품의 상품번호를 입력하세요.");
      INO = sc.nextInt();

      pstmt = conn.prepareStatement("SELECT * FROM ITEM WHERE INO = ?");
      pstmt.setInt(1, INO);
      int result = pstmt.executeUpdate();
      if (result == 0) {
         System.out.println("잘못된 상품번호입니다. 다시 입력하세요");
      } else
         break;
      }
      try {
         System.out.println(Integer.parseInt(CNO));
         pstmt = conn.prepareStatement("SELECT * FROM ITEM WHERE INO = ?");
         pstmt.setInt(1, INO);
         rs = pstmt.executeQuery();
         String iname;
         int iprice;
         int Seller_CNO;

         while (rs.next()) {

            iname = rs.getString(2);

            iprice = rs.getInt(3);

            Seller_CNO = rs.getInt(4);

            pstmt = conn.prepareStatement("INSERT INTO TRADE VALUES(?,?,?,?,?)");
            pstmt.setInt(1, INO);
            pstmt.setString(2, iname);
            pstmt.setInt(3, iprice);
            pstmt.setInt(4, Seller_CNO);
            pstmt.setInt(5, Integer.parseInt(CNO));
            System.out.println("상품명\t" + iname);
            System.out.println("판매가격\t" + iprice);

         } // end while

         System.out.println();
         pstmt2 = conn.prepareStatement("DELETE ITEM WHERE INO = ?");
         pstmt2.setInt(1, INO);

         System.out.println("정말 구매하시겠습니까?(Y/N)");
         if (sc.next().equalsIgnoreCase("Y")) {

            // 예외발생
            int result = pstmt.executeUpdate();
            int result2 = pstmt2.executeUpdate();
            conn.commit();
            System.out.println("구매되었습니다");
         } else {
            conn.rollback();
            System.out.println("롤백했습니다");
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