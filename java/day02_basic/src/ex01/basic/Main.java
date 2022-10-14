package ex01.basic;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

// 7월27일 수요일
// 류정수 백준 2753번

public class Main {

	public static void main(String[] args) throws IOException {
		System.out.println("년도를 입력하세요");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); // BufferedReader를 이용한 년도값 입력받기
		int year = Integer.parseInt(bf.readLine()); // 정수변환

		if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // 조건
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		bf.close();

		/*
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		 * //BufferedReader를 통해 버퍼를 생성하고 InputStreamReader가 System class를 호출하여 사용자로부터
		 * 입력을 받는다.
		 * 
		 * System.out.println("점수를 입력하세요"); int num = Integer.parseInt(bf.readLine());
		 * //받은 입력값(문자열)을 정수형으로 변환 // readLine = String, read = int, ready = boolean
		 * 
		 * if(num<=100 && num>=90){ //100~90점 A System.out.println("A"); } else
		 * if(num<=89 && num>=80){ //89~80점 B System.out.println("B"); } else if(num<=79
		 * && num>=70){ //79~70점 C System.out.println("C"); } else if(num<=69 &&
		 * num>=60){ //69~60점 D System.out.println("D"); } else { //60점 이하 F
		 * System.out.println("F"); }
		 * 
		 * bf.close(); //습관화하기!
		 */ }
}
