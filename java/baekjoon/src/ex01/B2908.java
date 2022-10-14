package ex01;

import java.util.Scanner;

public class B2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C, D;
		sc.close();
		
		C = (A%10)*100+((A/10)%10)*10+(A/100);
		D = (B%10)*100+((B/10)%10)*10+(B/100);
		if(C>=D) {
			System.out.println(C);
		}
		else System.out.println(D);
		
	
	}
}
