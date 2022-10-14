package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B18108 {
	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		int year = Integer.parseInt(bf.readLine()) - 543;
		System.out.println(year);
		
		
		bf.close();
	}
}
