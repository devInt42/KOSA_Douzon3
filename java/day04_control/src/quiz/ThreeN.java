package quiz;

import java.util.Scanner;
//3의배수

public class ThreeN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum=0;
		int cnt = 0;
		for(int i=1;i<=100;i++) {
			if(i%3 == 0) {
				sum += i;
				cnt++;
			}
		}
		System.out.println("3의 배수의 개수 : " + cnt + " 합 " + sum);
	}

}
