package ex03.network;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;

public class URLEx2 {
	public static void main(String[] args) throws MalformedURLException, IOException{ // 예외처리 위임
	
	URL url = new URL("https://search.naver.com/search.naver?where=nexearch&sm=top_sug.pre&fbm=0&acr=3&acq=%EA%B9%80%EC%97%B0%EC%95%84&qdt=0&ie=utf8&query=%EA%B9%80%EC%97%B0%EC%95%84");
	
	//System.in : 표준입력 - 키보드로부터~~
	BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
	
	System.out.println("프로토콜 : " + url.getProtocol());
	System.out.println("호스트와 포트 : " + url.getAuthority());
	System.out.println("호스트 : " + url.getHost());
	System.out.println("포트 : " + url.getPort());
	System.out.println("경로 : " + url.getPath());
	System.out.println("질의 : " + url.getQuery());
	System.out.println("파일명 : " + url.getFile());
	System.out.println("참조 : " + url.getRef());


	}
}
