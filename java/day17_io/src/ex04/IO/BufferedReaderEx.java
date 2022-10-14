package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx {
	public static void main(String[] args) throws IOException {
		
		/*
		InputStream is = System.in;
		Reader reader = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(reader);
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("charator input = ");
		String str = br.readLine();	 //예외발생, 여러개의 데이터 입력 받기
		
		System.out.println(str);
		
		
	}
}
