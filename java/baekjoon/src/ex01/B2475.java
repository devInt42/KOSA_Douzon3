package ex01;

import java.util.Scanner;

//22년 08월 01일
//더존비즈온 3기 류정수
//백준 2475번
public class B2475 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			num = sc.nextInt();
			sum += num*num;
		}
		System.out.println(sum%10);
	}
}