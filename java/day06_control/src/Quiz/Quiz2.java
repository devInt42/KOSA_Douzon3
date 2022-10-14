package Quiz;

import java.util.Scanner;

public class Quiz2 {
	public static void main(String[] args) {
		// 2번
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int num2 = 0;
		for (int i = 1; i <= num; i++) {
				num2 = (i%2==1)? -i : i;
			sum += num2;
		}
		System.out.println(sum);
	}
}
