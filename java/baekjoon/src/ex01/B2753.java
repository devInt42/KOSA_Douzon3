package ex01;

import java.io.IOException;
import java.util.Scanner;

public class B2753 {
	public static void main(String[] args) throws IOException {
		System.out.println("년도를 입력하세요");

		/*
		 * BufferedReader
		 * 
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //
		 * BufferedReader를 이용한 년도값 입력받기 int year = Integer.parseInt(bf.readLine());
		 * //정수변환 bf.close();
		 */

		// Scanner

		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // 조건
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		sc.close();
	}
}
