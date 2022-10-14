package quiz;

import java.util.Scanner;

public class MainSwitch {
	public static void main(String[] args) {
		System.out.println("도시를 선택하세요 (s, d, b, j)");
		String city = new Scanner(System.in).nextLine();
		switch(city){
		case "s" :
			System.out.println("서울");
			break;
		case "d" :
			System.out.println("대구");
			break;
		case "b" :
			System.out.println("부산");
			break;
		case "j" :
			System.out.println("제주");
			break;
		default:
			System.out.println("잘못선택하셨습니다. s,d,b,j중에서만 선택하세요");
			System.exit(0); //프로그램 강제 종료
		}
		System.out.println("를(을) 선택하셨습니다.");
	}
}
