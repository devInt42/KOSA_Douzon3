package ex01;

//22년 08월 17일
//더존비즈온 3기 류정수
//백준 1065번

import java.util.Scanner;

public class B1065 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int cnt = 0;
		for (int i = 1; i <= num; i++) {
			if (i < 100) {
				cnt++;
			} else if (i >= 100 && i < 1000) {
				int a = i / 100;				//100의자리수	
				int b = (i / 10) % 10;		//10의자리수
				int c = i % 10;				//1의자리수
				if ((a - b) == (b - c)) {	//자리수별 계산후 비교
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}
