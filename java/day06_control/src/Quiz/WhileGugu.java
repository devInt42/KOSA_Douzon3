package Quiz;

import java.util.Scanner;

public class WhileGugu {
	public static void main(String[] args) {
		System.out.println("단을 입력하세요");
		int dan = new Scanner(System.in).nextInt();	//Scanner를 활용해 원하는 값 입력받기
			int a = 1;
			while(a<10) {	//원하는 단, 구구단 출력
				System.out.println(dan + "*" + a+" = " + (a*dan));
				a++;
			}
			System.out.println("======================================");
			
	}
}
