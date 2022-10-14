package ex01_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		int sum = 0;

		System.out.println("arr data 5 input = ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(sum);

		/*
		int[] arr = {1,2,3,4,5};
		int sum = 0;
		
		for (int i = 0 ; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println(sum);	
		*/
	}
}
