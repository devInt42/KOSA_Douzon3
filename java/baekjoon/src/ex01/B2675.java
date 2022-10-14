package ex01;

import java.util.Arrays;
import java.util.Scanner;

//22년 08월 01일
//더존비즈온 3기 류정수
//백준 2675번

public class B2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt(); // 테스트 케이스 개수

		for (int a = 0; a < t; a++) {
			int r = sc.nextInt(); // 반복횟수
			String str = sc.next(); // 스트링
			
			for (int i = 0; i < str.length(); i++) {
				for (int j = 0; j < r; j++) {
					System.out.print(str.charAt(i));
				}
		
			}
			System.out.println();
		}
	}
}
