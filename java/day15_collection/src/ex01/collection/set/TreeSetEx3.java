package ex01.collection.set;

import java.util.TreeSet;

public class TreeSetEx3 {
	public static void main(String[] args) {

		TreeSet set = new TreeSet();
		String from = "a";
		String to = "d";

		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("car");
		set.add("Car");
		set.add("dZZZZZZ");
		set.add("dzzzzz");
		set.add("elephant");
		set.add("elevator");
		set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println("range search : from " + from + "\t to " + to);
		System.out.println("result : " + set.subSet(from, to));	//a포함 d 미포함 
	}
}
