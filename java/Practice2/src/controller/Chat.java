
package controller;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import dbConn.util.CloseHelper;
import dbConn.util.ConnectionHelper;

public class Chat {
	static String userName = null;
	static boolean seller = false;
	static String iname = null;
	static Scanner sc = new Scanner(System.in);
	static Statement stmt = null;
	static ResultSet rs = null;
	static ResultSet rs2 = null;
	static ResultSet rs3 = null;
	static Connection conn = null;
	static PreparedStatement pstmt = null;
	static PreparedStatement pstmt2 = null;
	static PreparedStatement pstmt3 = null;

	public static void start(int INO, int CNO) throws SQLException {
		Thread sender = null;
		Thread receiver = null;

		connect();
		// 현재 채팅을 실행한 물품 탐색
		pstmt = conn.prepareStatement("SELECT * FROM ITEM WHERE INO = ? ");
		pstmt.setInt(1, INO);
		rs = pstmt.executeQuery();

		// 우선 해당 물품 탐색
		while (rs.next()) {
			iname = rs.getString(2);
			// 만일 현재 유저가 판매자와 번호가 같다면
			// 현재 유저는 판매자이다.
			if (rs.getInt(4) == CNO) {
				seller = true;

				// 채팅창에 판매자가 있는지 확인
				pstmt2 = conn.prepareStatement("SELECT CHAT_SELLER FROM ITEM WHERE INO = ? ");
				pstmt2.setInt(1, INO);
				rs2 = pstmt2.executeQuery();
				while (rs2.next()) {
					// 판매자가 있다면 채팅시스템 종료
					if (rs2.getString(1).equals("ON")) {
						System.out.println("현재 채팅창이 가득 찼습니다. 다음에 이용해주세요.");
						return;
					} else {
						// 만일 판매자가 없다면 판매자가 있다고 해준다.
						pstmt3 = conn.prepareStatement("UPDATE ITEM SET CHAT_SELLER = 'ON' WHERE INO = ? ");
						pstmt3.setInt(1, INO);
						rs3 = pstmt3.executeQuery();
						conn.commit();
					}

				} // 판매자 존재 여부 확인 종료

				// 현재 유저가 판매자가 아니고 구매자인 경우
			} else {
				seller = false;
				// 다른 구매자가 있는지 확인 확인
				pstmt2 = conn.prepareStatement("SELECT CHAT FROM ITEM WHERE INO = ? ");
				pstmt2.setInt(1, INO);
				rs2 = pstmt2.executeQuery();

				while (rs2.next()) {
					// 구매자 있다면 채팅시스템 종료
					if (rs2.getString(1).equals("ON")) {
						System.out.println("현재 채팅창이 가득 찼습니다. 다음에 이용해주세요.");
						return;
					} else {
						// 만일 구매자가 없다면 구매자가 있다고 해준다.
						pstmt3 = conn.prepareStatement("UPDATE ITEM SET CHAT = 'ON' WHERE INO = ? ");
						pstmt3.setInt(1, INO);
						rs3 = pstmt3.executeQuery();
						conn.commit();
						System.out.println("커밋함");
					}
				} // 구매자 존재 여부 확인 종료
			} // 구매자인 경우 종료
		} // 현재 물품에 대한 유저정보 확인 종료

		// 현재 유저의 이름 찾기
		pstmt = null;
		rs = null;

		// 유저 이름 찾기
		pstmt = conn.prepareStatement("SELECT CNAME FROM CUSTOMER WHERE CNO = ? ");
		pstmt.setInt(1, CNO);
		rs = pstmt.executeQuery();
		while (rs.next())
			userName = rs.getString(1);

		// 메인함수에 들여온 함수인자가 존재할 시
		try {
			String ip = "192.168.110.27"; // ip값 초기화
			Socket s = new Socket(ip, 7777);

			System.out.println();
			System.out.println("============== 채팅창 ===============");
			System.out.println("떡잎마켓의 " + iname + "의 거래 채팅방입니다. ");
			System.out.println("채팅방을 종료하고 싶으시면 ' 종료 ' 를 입력하시면 됩니다.");
			// sender와 receiver 쓰레드를 만든다.
			sender = new Thread(new ClientSender(s, userName, seller, INO));
			receiver = new Thread(new ClientReceiver(s));
			sender.start();
			receiver.start();

		} catch (Exception e) {
			e.printStackTrace();
		}

		while (true) {

			// sender와 receiver 스레드의 상태정보를 확인한다.
			@SuppressWarnings("null")
			Thread.State sender_state = sender.getState();
			Thread.State receiver_state = receiver.getState();

			// 만일 sender, 혹은 receiver 둘 중 하나가 종료되면 채팅방을 종료하고 메뉴로 돌아간다.
			if (sender_state == Thread.State.TERMINATED || receiver_state == Thread.State.TERMINATED) {
				System.out.println("채팅방을 종료하고 메뉴로 돌아갑니다. ");
				pstmt = null;
				rs = null;

				if (seller) {
					pstmt = conn.prepareStatement("UPDATE ITEM SET CHAT_SELLER = 'OFF' WHERE INO = ? ");
					pstmt.setInt(1, INO);
					rs = pstmt.executeQuery();
					conn.commit();
				} else {
					pstmt = conn.prepareStatement("UPDATE ITEM SET CHAT = 'OFF' WHERE INO = ? ");
					pstmt.setInt(1, INO);
					rs = pstmt.executeQuery();
					conn.commit();
				}
				return;
			}
		}

	}// main end

	// 클라이언트의 sender 스레드 클래스
	static class ClientSender extends Thread { // inner class

		Socket s; // socket
		DataOutputStream dos; // dataoutputstream : 파일에 데이터를 입력한다.
		String name;
		boolean seller;
		int ino;

		public ClientSender(Socket s, String name, boolean seller, int ino) { // 생성자 함수
			this.s = s;
			try {
				dos = new DataOutputStream(s.getOutputStream()); // Socket의 outputstream을 할당받는다. 즉 Socket에서 Data를 전송할 수
				// 있는 방법을 가져온다.
				this.ino = ino;
				this.name = name;
				this.seller = seller;

			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			Scanner sc = new Scanner(System.in);
			try {
				String user = null;
				if (seller == false) {
					user = "[구매자]" + name;
				} else
					user = "[판매자]" + name;

				if (dos != null) {
					// sender로 사용자 이름과 신분을 보낸다.
					dos.writeUTF(name);
					dos.writeBoolean(seller);
				}
				while (dos != null) {
					String chat = sc.nextLine();
					// 만일 종료한다고 하면
					if (chat.equals("종료")) {
						try {

							// 채팅 종료 시 판매자일 경우 chat_seller off전환
							if (seller) {
								pstmt = null;
								rs = null;

								pstmt = conn.prepareStatement("UPDATE ITEM SET CHAT_SELLER = 'OFF' WHERE INO = ? ");
								pstmt.setInt(1, ino);

								rs = pstmt.executeQuery();
								// commit
								conn.commit();
							} else {
								pstmt = null;
								rs = null;

								pstmt = conn.prepareStatement("UPDATE ITEM SET CHAT = 'OFF' WHERE INO = ? ");
								pstmt.setInt(1, ino);

								rs = pstmt.executeQuery();
								// commit
								conn.commit();
							}

							s.close();
							dos = null;
						} catch (SocketException e) {
							return;
						}
					}
					dos.writeUTF(user + ": " + chat);
				}
			} catch (Exception e) {
			}
		} // end run()

	} // end ClientSender class

	// 클라이언트의 recevier 스레드
	static class ClientReceiver extends Thread {

		Socket s;
		DataInputStream dis; // DataInputStream은 전달받은 데이터를 데이터타입별로 입력받는다.

		public ClientReceiver(Socket s) {
			this.s = s;
			try {
				dis = new DataInputStream(s.getInputStream()); // 소켓에 생성된 InputStream을 DatainputStream으로 받아온다.
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		@Override
		public void run() {
			while (dis != null) {
				try {
					// 소켓 종료
					if (s.isClosed()) {
						try {
							s.close();
							dis = null;
						} catch (SocketException e) {
							return;
						}
					}
					try {
						System.out.println(dis.readUTF());
					} catch (NullPointerException e) {
					}
				} catch (SocketException e) {
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	} // end ClientSender class

	public static void connect() {
		try {
			conn = ConnectionHelper.getConnection("oracle");
			stmt = conn.createStatement();
			conn.setAutoCommit(false);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

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
}