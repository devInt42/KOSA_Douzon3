package ex01;

import java.util.Scanner;

public class B11720 {
	public static void main(String[] args) {
		int a = new Scanner(System.in).nextInt();
		String b = new Scanner(System.in).nextLine();
		int sum=0;
		
		for(int i=0; i<a;i++) {
			sum += b.charAt(i)-'0';
		}
			System.out.println(sum);
	}
}
