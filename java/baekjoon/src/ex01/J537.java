package ex01;

import java.util.Scanner;
// 22년 07월 29일
// 더존비즈온 3기 류정수
// 정골 537번
public class J537 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	//Scanner객체생성
		int num = sc.nextInt();					//입력값
		int sum = 0;									//출력값
		int cnt = 0;									//횟수카운트

		if (num <= 100 && num > 0) {	//100이하 양수
			while (num > cnt) {
				cnt++;
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
