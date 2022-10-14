package quiz;

import java.util.Scanner;

// 문제2] 8월 한달간의 강수량을 입력 받아서, 평균 구하는 프로그램
public class QuizEx01 {
	public static void main(String[] args) {
	//확장 for문
		int[] arr = {1,7,3,7,99,7,8,55,7,90,7};
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
		System.out.println("\n=====================================");
		//for(자료형 변수명 : 컬렉션명 or 배열명){   }
		
		//확장(개선된) for문
		for(int item : arr) {
			System.out.print(item+ " ");
		}
		
	}
}
