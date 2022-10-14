package ex04.Switch;

import java.util.Scanner;

public class SwitchBreak {
	public static void main(String[] args) {
		System.out.println("숫자를 입력하세요 input : ");
		int point = new Scanner(System.in).nextInt();

		switch (point % 2) { // 정수형 (long제외), 문자형만 들어올수있다. 실수형 x
		case 0: // 숫자, '문자', "문자열"
			System.out.print("짝수입니다. ");
			break;
		case 1:
			System.out.print("홀수입니다.");
			break;

		}
	}
}