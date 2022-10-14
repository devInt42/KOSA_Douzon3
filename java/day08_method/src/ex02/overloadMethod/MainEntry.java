package ex02.overloadMethod;

public class MainEntry {
	public static int plus(int x, int y) {
		int hap = x + y;
		return hap;
	}
	
	
	public static int plus(int x, int y, int z) {	//객체지향이기 때문에 함수명이 같아도 문제없다.
		int hap = x + y;
		return hap;
	}
	
	public static void add(String str1, String str2) {
		System.out.println(str1 +" "+ str2);
	}
	public static void add(double str1, double str2) {
		System.out.println(str1 +str2);
	}
	public static void main(String[] args) {
		add("kosa", "love");
		add(2.7, 3.6);
		System.out.println(plus(3, 5));
		System.out.println(plus(3, 5, 7));

	}

}
