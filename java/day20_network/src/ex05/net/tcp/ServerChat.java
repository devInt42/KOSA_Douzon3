package ex05.net.tcp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerChat {

	public static void main(String[] args) throws IOException {  // 
		int port = 8000;
		ServerSocket  ss = new ServerSocket(port); 
		System.out.println("chat server start!!!");
		
		while(true) {
			Socket s = ss.accept();
			InputStream  is = s.getInputStream();  //네트워크 통해 읽기...
			BufferedReader  br = new BufferedReader(new InputStreamReader(is));
			PrintStream  ps = new PrintStream(System.out);
			
			ps.print( s.getInetAddress().getHostAddress() ); //
			String str = br.readLine();
			byte[] buffer = str.getBytes("euc-kr");  //  or UTF-8
			String message = new String(buffer, "euc-kr");
			
			ps.print("         :      에서 수신 메세지 =====>  " +  message);
			
			br.close();
			s.close();			
		}  // end while
	}

}
