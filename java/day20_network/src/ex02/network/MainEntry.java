package ex02.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MainEntry {
	
	public static void main(String[] args) {
		String host = "192.168.110.22";
		
		try {
			InetAddress[] address = InetAddress.getAllByName(host);
			for(InetAddress item : address) {
				System.out.println(item.getCanonicalHostName());
			}
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
