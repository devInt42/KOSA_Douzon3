package ex01;

import java.util.Scanner;
//8958
public class B8958 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] arr = new String[sc.nextInt()];

		for (int i = 0; i < arr.length; i++) { // a개만큼의 String 배열에 입력
			arr[i] = sc.next();
		}
		sc.close();

		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			int sum = 0;

			for (int j = 0; j < arr[i].length(); j++)	{
				if(arr[i].charAt(j)=='O') {
					cnt++;	//O가 몇번 연속하는지
				}
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			System.out.println(sum);
		}
	}
}
