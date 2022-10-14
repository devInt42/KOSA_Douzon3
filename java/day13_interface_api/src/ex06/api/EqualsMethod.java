package ex06.api;

class Circle {
	int x, y;
}

public class EqualsMethod {
	public static void main(String[] args) {
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		System.out.println("c1 : " + c1.hashCode());
		System.out.println("c2 : " + c2.hashCode());

		if (c1 == c2)
			System.out.println("same");
		else
			System.out.println("not same");

		int x = 3, y = 3;
		System.out.println("기본 자료형 비교");
		if (x == y)
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println("참조 자료형 비교");
		String str1 = new String("Korea");
		String str2 = new String("korea");
		if (str1 == str2)
			System.out.println("same");
		else
			System.out.println("not same");
		
		System.out.println("********equals method********");
		if(str1.equals(str2)) System.out.println("sames!!!");	//대소문자 구분
		else System.out.println("not same!!!");
		
		System.out.println("-------------------------------");
		if(str1.equalsIgnoreCase(str2)) System.out.println("sames!!!");	//대소문자 구분 X
		else System.out.println("not same!!!");
		
		
	}
}
