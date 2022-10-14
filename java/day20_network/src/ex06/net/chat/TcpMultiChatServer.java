package ex06.net.chat;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpMultiChatServer {// outer class

	HashMap clients; // key, value

	public TcpMultiChatServer() {// 생성자 함수
		clients = new HashMap();// HashMap 객체 생성
		Collections.synchronizedMap(clients); // 1초라도 먼저 입력한 메세지가 먼저 오도록 동기화
	}

	public void start() {
		ServerSocket ss = null; // server socket 1
		Socket s = null; // client socket 2

		try {
			ss = new ServerSocket(7777);

			while (true) {
				s = ss.accept(); // 응답 대기, 클라이언트 소켓
				System.out.println("[ " + s.getInetAddress() + " : " + s.getPort() + "] 에서 접속하셨습니다."); // 주소, 포트번호
				ServerReceiver thread = new ServerReceiver(s); // user class
				thread.start(); // 실제 thread가 갖고있는 메소드 , 앞서 정의한 start와 별개
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}// end start

	public void sendToAll(String msg) {
		Iterator it = clients.keySet().iterator(); // key값 출력

		
		while (it.hasNext()) { // 요소가 있다면
			try {
				DataOutputStream dos = (DataOutputStream) clients.get(it.next());
				System.out.println("dos.toString = " + dos.toString());
				dos.writeUTF(msg);
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	class ServerReceiver extends Thread {// inner class
		Socket s;// client socket
		DataInputStream dis; // readXXX() - XXX : 자료형
		DataOutputStream dos; // writeXXX()

		public ServerReceiver(Socket s) {// 매개변수를 갖고잇는 생성자 함수
			this.s = s;
			try {
					dis = new DataInputStream(s.getInputStream()); //네트워크 통해서 읽기
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		@Override
		public void run() {// 스레드 구현부
			String name = "";
			try {
				name = dis.readUTF();
				sendToAll("#"+name+ " 님이 입장하셨습니다.");
				
				System.out.println(dos.toString().hashCode());
				clients.put(name, dos); //HashMap넣기
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");// 접속자수 확인
				while(dis != null) {
					sendToAll(dis.readUTF());
				}
			} catch (Exception e) {
				// TODO: handle exception
			} finally {
				sendToAll("#"+name+"님이 나가셨습니다.");
				clients.remove(name);//접속자수 제거
				System.out.println("[ " + s.getInetAddress() + " : " + s.getPort() + "] 에서 접속 종료하셨습니다."); // 주소, 포트번호
				System.out.println("현재 서버 접속자 수는 : " + clients.size() + " 입니다.");
			}
			
		}// end run()

	} // end ServerReceiver

	public static void main(String[] args) {

	}
}
