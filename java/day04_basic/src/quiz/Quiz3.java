package quiz;

import java.util.Scanner;
//문제1 입력받은 3개값 큰순서대로 출력
//류정수

public class Quiz3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		sc.close();
		
		if((num3 >= num2)&&(num2>=num1)) { //123
			System.out.println(num3 + " > " + num2 + " > " + num1);
		}
		else if (num2>=num3 && num3>=num1){ //132
			System.out.println(num2 + " > " + num3 + " > " + num1);
		}
		else if (num3>=num1 && num1>=num2){ //213
			System.out.println(num3 + " > " + num1 + " > " + num2);
		}
		else if (num2>=num1 && num1>=num3){ //231
			System.out.println(num2 + " > " + num1 + " > " + num3);
		}
		else if (num1>=num3 && num3>=num2){ //312
			System.out.println(num1 + " > " + num3 + " > " + num2);
		}
		
		else if (num1>=num2 && num2>=num3){ //321
			System.out.println(num1 + " > " + num2 + " > " + num3);
		}
		else {
			System.out.println("오류입니다.");
		}
	}
}
