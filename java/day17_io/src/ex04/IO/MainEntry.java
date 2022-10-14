package ex04.IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainEntry {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("숫자1");
		int num1 = Integer.parseInt(br.readLine());
		System.out.println("숫자2");
		int num2 = Integer.parseInt(br.readLine());
		System.out.println("+\t-\t*\t/");
		String op = br.readLine();
		int res=0;
		switch(op) {
		case "+":
			res=num1+num2;
			break;
		case "-":
			res=num1-num2;
			break;
		case "*":
			res=num1*num2;
			break;
		case "/":
			try {
			 res = num1/num2;
			} catch(ArithmeticException e){
				e.printStackTrace();
			}
		}
		System.out.println(num1+ op + num2 + " = " + res);

	}
}
