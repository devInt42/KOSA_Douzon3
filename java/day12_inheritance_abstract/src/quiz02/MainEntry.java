package quiz02;

import java.util.Scanner;

	public class MainEntry {
		public static void main(String[] args) {
			Trans[] t = new Trans[4];
			t[0] = new Bus();
			t[1] = new Subway();
			t[2] = new Bicycle();
			t[3] = new Plane();
			
			System.out.println("출발합니다.");
			for(int i = 0; i <t.length; i ++) {
				t[i].Start();
			}
			
			System.out.println("멈춥니다.");
			for(int i = 0; i<t.length; i ++) {
				t[i].Stop();
			}
		}
	}