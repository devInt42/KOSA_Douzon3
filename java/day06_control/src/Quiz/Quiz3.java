package Quiz;

import java.util.Scanner;

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 0;
		for(double i=1; i<=num; i++) {
			sum += i/(i+1);
		}
		System.out.printf("%.2f",sum);
	}
}
