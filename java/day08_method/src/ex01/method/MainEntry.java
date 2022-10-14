package ex01.method;

public class MainEntry {

//	 1) 매개변수 없고, 리턴타입 없는 경우
//	public returnType methodName() {  }
	public static void line() {
		System.out.println("------------------------------");
	}
	
//	2) 매개변수 있고, 리턴타입 없는 경우
//    public returnType methodName(parameter var1, parameter var2,.... ) {  }
	public static void showName(String name, int age) {
		System.out.println("당신의 이름은 " + name + "시군요.");
		System.out.println("당신은 " + age + "살.");
	}
	public static void main(String[] args) {
		
		showName("김연아", 32);
		
		line();
		System.out.println("main start");
		showName("박태환", 26);
		line();
		showName("전두환", 60);
		line();
		display();  // 함수호출
		showName("이순신", 100);
		line();
		System.out.println("main end");
		line();
	}
	
	public static void display() {  // 함수정의부
		System.out.println("happy doyeon");
	}
}
