package ex01;
import java.util.Scanner;

public class B11050 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int calNum1 = 1;
		int calNum2 = 1;
		for (int i = 0; i < num2; i++) {
			calNum1 *= (num1 - i);
			calNum2 *= (num2 - i);
		}
		System.out.println(calNum1 / calNum2);

	}
}
