package ex01.scanner;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x=9;
		System.out.println("Integer input : ");
		int y = sc.nextInt();
		char ch = sc.next().charAt(2);  //char받는법 String으로 받고.charAt( index );s
		

		
		System.out.println(x + "," + y);
		
	}
}
