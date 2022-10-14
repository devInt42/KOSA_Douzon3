package quiz;

import java.util.Scanner;
//구구단

public class Gugudan {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	
	for(int i=1 ; i<10; i++) {
		System.out.println(a+ " * " + i + " = " + a*i);
	}
	}
}
