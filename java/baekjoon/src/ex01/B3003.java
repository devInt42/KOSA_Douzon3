package ex01;

import java.util.Scanner;
//22년 08월 08일
//더존비즈온 3기 류정수
//백준 11653번
public class B3003 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int[] arr = new int[6];
			int[] arr2 = {1,1,2,2,2,8};
			
			for(int i=0; i<arr.length;i++) {
				arr[i] = sc.nextInt();
				System.out.print((arr2[i]-arr[i]) +" ");
			}
		}	 
	}