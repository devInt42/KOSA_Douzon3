package ex03.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class URLEx {
	public static void main(String[] args) throws MalformedURLException, IOException{ // 예외처리 위임
	
	URL google = new URL("http://www.google.com");
	
	//System.in : 표준입력 - 키보드로부터~~
	BufferedReader br = new BufferedReader(new InputStreamReader(google.openStream()));
	
	String inputLine;
	while((inputLine = br.readLine())!=null) {//
		System.out.println(inputLine);
		
		
	}
	br.close();
	}
}
