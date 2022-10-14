package ex01.method;

import java.util.Scanner;

public class MethodMain {
	
//	문제1] info() {  이름, 연락처, 주소 출력 함수 }
	public static void info() {
		System.out.println("name, phone , address = ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		String phone = sc.next();
		String address = sc.next();
		System.out.println("당신은 " + name +"님의 연락처 : "+phone +" 주소는 : " + address +"에 살고 계시는군요.");
	}
//	문제2] abs(int x) { 절대값 출력하는 함수 만들기 }
//	public static void abs(int x) {
//		if( x < 0 ) x = -x;	
//		else x = x;
//		
//		System.out.println("abs = " + x);
//	}
	
	public static int abs(int x) {
		if( x < 0 ) x = -x;
		else x = x;
		
		return x;
	}
	
//	문제3] max() {   두개 정수 입력 받아서 큰수 리턴 하는 함수 }
	public static void max() {
		Scanner sc = new Scanner(System.in);
		System.out.println("integer data input x, y = ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int result = (x > y) ? x : y;
		
		System.out.println(x +"와 " +y +" 중에서 max = " + result);
		
	}
	
	public static void main(String[] args) {
		while(true) {
			System.out.println("integer data input(1,2,3,0) = ");
			
			Scanner sc = new Scanner(System.in);
			int choice = sc.nextInt();
			
			switch (choice) {
			case 1: max(); 	break;
			
			case 2: 
				System.out.print("integer  data abs = ");
				int num = sc.nextInt();
				int abs = abs( num ); 	System.out.println(num+" 에 대한 절대값 = " + abs); break;
				
			case 3: info(); 	break;
			
			case 0 : System.out.println("프로그램 종료합니다.");
						System.exit(0);
			}	// end switch
			
		}// end while
//		max();
//		int su = sc.nextInt();
//		int abs = abs(su);
//		System.out.println(abs);
//		
//		info();
	}
}









