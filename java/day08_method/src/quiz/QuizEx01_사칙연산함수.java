package quiz;

import java.util.Scanner;

public class QuizEx01_사칙연산함수 {
	public static void line() {
		System.out.println("========================");
	}

	public static void add(int x, int y) {
		System.out.println(x + " + " + y + " = " + (x + y));
	}

	public static int sub(int x, int y) {
		return x - y;
	}

	public static int mul(int x, int y) {
		return x * y;
	}

	public static void div(int x, int y) {
		try {
			int result = x / y;
			System.out.println(result);
		} catch (Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data input x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		add(x, y);
		line();
		System.out.println(sub(x, y));
		line();
		System.out.println(mul(x, y));
		line();
		div(x, y);
	}
}
