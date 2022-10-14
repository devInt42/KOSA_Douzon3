package ex04.Switch;
import java.util.Scanner;
public class SwitchBreak3 {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는?(1~3)점 input : ");
		int point = new Scanner(System.in).nextInt();

		switch (point) { // 정수형 (long제외), 문자형만 들어올수있다. 실수형 x
		case 1: // 숫자, '문자', "문자열"
			System.out.print("집 ");
		case 2:
			System.out.print(" 피아노 ");
		case 3:
			System.out.print(" 우산 ");
		}
		System.out.println("상품에 당첨되셨습니다. 축하합니다.");
	}
}
