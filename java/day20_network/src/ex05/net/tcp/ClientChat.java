package ex05.net.tcp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.net.Socket;

public class ClientChat {
	public static void main(String[] args) throws IOException {
		int port = 8000;
		String ip, str;
		
		PrintStream ps = new PrintStream(System.out);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //키보드로부터 입력받기
		
		ps.print("접속할 서버 ip ===> \n"); ip = br.readLine();
		ps.print("전송할 메세지 ===> "); str = br.readLine();
		
		byte[] buffer = str.getBytes("euc-kr");
		String message = new String(buffer, "euc-kr");
		
		Socket client = new Socket(ip, port); // sever ip & port number socket 생성
		OutputStream os = client.getOutputStream();	//네트워크를 ip 통해서 사용
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
		bw.write(message, 0, message.length());
		bw.flush();
		
		bw.close();
		client.close();
		ps.println(ip + " 에 메시지 전송 성공");
		ps.close();
		
	}	
}
