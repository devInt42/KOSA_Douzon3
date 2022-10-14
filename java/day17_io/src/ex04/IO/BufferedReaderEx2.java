package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderEx2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("input = ");
		String str1 = br.readLine();
		System.out.println("input = ");
		String str2 = br.readLine();

		int su1 = Integer.parseInt(str1);
		int su2 = Integer.parseInt(str2);

		System.out.println(su1 + " , " + su2);
		System.out.println(su1 + su2); // 연산처리

	}
}
