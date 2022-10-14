package ex02.If;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("Integer data : ");
		int su = new Scanner(System.in).nextInt();
		String num = null;
		num = ((su % 2) == 0) ? 
				(su == 0) ? "zero" : "even"
				: "odd";
		
		System.out.println(num);
	}
}
