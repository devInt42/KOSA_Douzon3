package quiz;

import java.util.Scanner;

public class Quiz1 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("숫자 2개를 입력하세요");
	int num1 = sc.nextInt();
	int num2 = sc.nextInt();
	
	if(num1 > num2) {
		System.out.println(num1);
	}
	else if(num1 < num2) {
		System.out.println(num2);
	}
	else {
		System.out.println("same");
	}
}
}
