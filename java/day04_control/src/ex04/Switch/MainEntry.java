package ex04.Switch;
import java.util.Scanner;
public class MainEntry {
	public static void main(String[] args) {
		System.out.println("당신의 포인트 점수는?(1~3)점 input : ");
		//int point = new Scanner(System.in).nextInt();
		double point = new Scanner(System.in).nextInt();

		switch ((int)point) { // 정수형 (long제외), 문자형만 들어올수있다. 실수형 x
		case 1: // 숫자, '문자', "문자열"
			System.out.println("포인트 점수 1점");
			break;
		case 2:
			System.out.println("포인트 점수 2점");
			break;
		case 3:
			System.out.println("포인트 점수 3점");
			break;
		default:
			System.out.println("없는 점수 입니다. 1~3까지만 입력 요망");
		}
	}
}
