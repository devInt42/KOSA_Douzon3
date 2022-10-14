package ex01.collection.set;

import java.util.Set;
import java.util.TreeSet;

//Set : 순서 없고, 중복 허용 x
public class TreeSetEx2 {
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for (int i=0; set.size()<6 ; i++) {
			int num = (int)(Math.random()*45)+1; //0 ~ n-1까지
			
			set.add(num);
		}
		System.out.println(set);
	}
}
