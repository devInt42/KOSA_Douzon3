package quiz;

import java.util.Scanner;

//부호문제
//류정수
public class Quiz2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		// char op = sc.next().charAt(0);		//string으로 입력받은 값을 char로 변환
		String op = sc.next();
		int result = 0;
		sc.close();
		
		//String 문자를 .equals 처리
		if (op.equals("+"))
			result = num1 + num2;
		else if (op.equals("-"))
			result = num1 - num2;
		else if (op.equals("*"))
			result = num1 * num2;
		else if (op.equals("/"))
			result = num1 / num2;
		else
			System.out.println("부호를 잘못 입력했습니다.");

		/*
		 //char 문자 
		 * if (op == '+') { result = num1 + num2; }
		 * 
		 * else if (op == '-') { result = num1 - num2; }
		 * 
		 * else if (op == '*') { result = num1 * num2; }
		 * 
		 * else if (op == '/') { result = num1 / num2; }
		 * 
		 * else { System.out.println("부호를 잘못 입력했습니다."); }
		 */
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);

	}

}
