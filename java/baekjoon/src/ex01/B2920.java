package ex01;

import java.util.Arrays;
import java.util.Scanner;

//22년 08월 01일
//더존비즈온 3기 류정수
//백준 2920번

public class B2920 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt =0;
		int[] arr = new int[8];
		for (int i=0; i<arr.length;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		String res = "";
		for (int j = 0 ; j < arr.length-1 ; j++) {
			if(arr[j] == arr[j+1]-1) { // a[i] < a[i+1]
				cnt++;
			}
			else if(arr[j] == arr[j+1]+1) { // a[i] > a[i+1] 
				cnt--;
			}
		}
		if (cnt == 7) {
			res = "ascending";
		}
		else if (cnt == -7) {
			res = "descending";
		}
		else res = "mixed";
		System.out.println(res);
	}
}
