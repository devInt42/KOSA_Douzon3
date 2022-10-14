package quiz.three;

import java.util.Scanner;

public class Person {
	protected String name;
	protected int height, weight;
	public Person(String name, int height , int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public static Person input(Scanner sc) {
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("키 : ");
		int height = sc.nextInt();
		System.out.println("몸무게 : ");
		int weight = sc.nextInt();
		return new Person(name, height, weight);

	}
	
}
