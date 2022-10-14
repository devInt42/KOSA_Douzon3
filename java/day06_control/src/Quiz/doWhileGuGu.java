package Quiz;

import java.util.Scanner;

public class doWhileGuGu {
	public static void main(String[] args) {
		int a=2, b=1;
		do {
			do {
				System.out.print(a + " * " + b + " = " + (a*b) + "\t");
				b++;
			}while(b<10);
			b=1; // 초기화 해주기
			System.out.println();
			a++;
		} while(a<10);
	}
}
