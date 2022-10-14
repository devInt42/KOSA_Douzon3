package ex08_doWhile;

import java.util.Scanner;

public class MainDoWhile {
	public static void main(String[] args) {
		System.out.println("jumsu(0~100 사이 점수만 입력 ) = ");
		int su;
		do {
			su = new Scanner(System.in).nextInt();
			System.out.println(su);
		} while(su>=0&&su<=100);
		
		System.out.println("0~100이 아닙니다.");
	}
}
