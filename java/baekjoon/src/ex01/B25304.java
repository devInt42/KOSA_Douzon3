package ex01;

import java.util.Scanner;

public class B25304 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tot = sc.nextInt();
		int cnt = sc.nextInt();
		int sum = 0;
		int[]arr = new int[cnt];
		int[]arr2 = new int[cnt];
	
		for (int i = 0; i < cnt; i++) {
			arr[i] = sc.nextInt();
			arr2[i] = sc.nextInt();
			sum += arr[i]*arr2[i];
			}
		if (tot == sum) {
			System.out.println("Yes");
		}

		else {
			System.out.println("No");
		}
	}
}
