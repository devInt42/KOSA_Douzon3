package ex01.collection.set;

import java.util.TreeSet;

//Set : 순서 없고, 중복 허용 x
public class TreeSetEx1 {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		int[] score = { 85, 95, 35, 45, 65, 10, 100 };
		
		for(int i=0; i<score.length;i++) {
			set.add(new Integer(score[i]));
		}
		System.out.println(set); //Treeset은 자동 정렬하는 기능이 있다.
		
		System.out.println("50보다 작은 값 : " + set.headSet(new Integer(50)));	//50을 기준으로 앞에 값들
		System.out.println("50보다 큰 값 : " + set.tailSet(50));	//50을 기준으로 뒤의값
		System.out.println(set.first());	//제일 처음값을 출력 == 제일 작은값
		System.out.println(set.last());		//마지막을 출력 == 제일 큰값
	}
}
