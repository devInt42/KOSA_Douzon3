package ex03.oop;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Sawoen s = new Sawoen();
		
		Scanner sc = new Scanner(System.in);
		s.input();
		System.out.println("====================");
		s.display();
		
		Sawoen[] ss = new Sawoen[2];
		for (int i=0; i< ss.length; i++) {
			ss[i]= new Sawoen();
			ss[i].input();
			ss[i].display();
		}
		
		
	}

}
