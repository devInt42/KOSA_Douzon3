package Quiz;

import java.util.Scanner;

public class Quiz1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				sum += j;
			}
		}
		System.out.println(sum);
		
		
/*		//2번
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = 0;
		int num2 = 0;
		for (int i = 1; i <= num; i++) {
			num2 = (i % 2 == 1) ? -i : i;
			sum += num2;
		}
		System.out.println(sum);
*/		
		
		
	/*	//3번
	 * 	Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double sum = 0;
		for(double i=1; i<=num; i++) {
			sum += i/(i+1);
		}
		System.out.printf("%.2f",sum);
	*/
		}
	}

