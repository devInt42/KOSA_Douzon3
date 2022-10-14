package ex01;

import java.util.Scanner;

public class B1978 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt(); // 받을 수의 수
		int[] arr = new int[num];
		int cnt = 0;
		int primeNumber = 0;
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt(); // 배열에 숫자 넣기
			cnt = 0; // cnt 초기화
			for (int j = 2; j <= arr[i]; j++) {	//2부터 자기자신까지 나눠서 나머지가 0인수 찾기
				if (arr[i] % j == 0) {
					cnt++;
				}
			}
			if (cnt == 1)		//2부터 자기자신까지 나눴을때 나머지가 0인 수가 1개 즉 자기 자신인경우 소수
				primeNumber++;

		}
		System.out.println(primeNumber);
	}
}
