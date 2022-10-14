package ex01_array;

import java.util.Arrays;
import java.util.Scanner;

public class ForeachTest {
	public static void main(String[] args) {
		int sum = 0, num;
		/*		for (num = 1;; num++) {// 무한루프
					sum += num;
					if (sum >= 100)
						break;
				}
				System.out.println(sum);
				System.out.println(num);*/

		int[] score = { 78, 70, 88, 99, 58 };
		int hap = 0;
		for (int item : score) {
			sum += item;
		}
		System.out.println(sum);

	}
}
