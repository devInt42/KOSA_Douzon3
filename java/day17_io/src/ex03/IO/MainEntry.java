package ex03.IO;

import java.io.IOException;
import java.io.InputStream;

public class MainEntry {
	public static void main(String[] args) {
		InputStream is = System.in;

		try {
			System.out.print("단일 문자 입력 : ");

			int num = is.read();	//예외발생, '0'~'9' : 48~57(ASCII code)
			is.read();	//1byte를 입력받지만 java char는 2byte임로 2번 작성
			is.read();

			int num2 = is.read() - 48;
			
			System.out.println(num);
			System.out.println(num2);
			
			
			
		} catch (IOException e) {//예외 처리
			e.printStackTrace();
		}

	}
}
