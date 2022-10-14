package ex04.net.tcp;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class ClientTest { // Socket 1개 필요
	public static void main(String[] args) {
		Socket s = null;
		try {
			s = new Socket("192.168.110.22", 9000);	//ipconfig 
			// I / O
			InputStream is = s.getInputStream(); // read
			OutputStream os = s.getOutputStream(); // write
			String str = "안녕하세요......Server~~~~~";
			os.write(str.getBytes());
			
			byte[] buffer = new byte[100];
			is.read(buffer);
			System.out.println(new String(buffer));
			
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}finally {
			try {
				s.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
