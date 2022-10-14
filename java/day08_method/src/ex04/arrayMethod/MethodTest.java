package ex04.arrayMethod;

public class MethodTest {
	
	public static void line() {
		System.out.println("-----------------------");
	}
	
	public static void add(String str1, String str2) {
		System.out.println(str1 + str2);
		line();  // 함수 호출
	}

	public static void main(String[] args) {
		add("kbs ", "sbs");
		add("kbs2 ", "sbs2");
		add("kbs3 ", "sbs3");
	}

}
