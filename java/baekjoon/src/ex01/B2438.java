package ex01;

/* 2022-07-27
 * 백준 : 2753번
 * 더존비즈온 3기 류정수
 */ 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class B2438 {

	public static void main(String[] args) throws IOException {
		/*
		 * //bufferedReader사용 
		 * BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 	//BuffereReader 객체 생성
		 * int num = Integer.parseInt(bf.readLine());		//받은 값을 정수로 변환
		 */
		
		
		//Scanner 사용
		Scanner sc = new Scanner(System.in);		//Scanner 객체 생성
		int num = sc.nextInt();
		
		
		for (int i = 1; i <= num; i++) {		//반복문을 통해 행을 결정해준다.
			for (int j = 1; j <= i; j++) {		
				System.out.print("*");		//현재 i의 값만큼 *출력하는 반복문
			}
			System.out.println();
		}

	}

}
