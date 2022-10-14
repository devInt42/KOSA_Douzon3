package ex02.Interface;

public class BB implements IDraw {

	@Override
	public void draw() {
		System.out.println("BB 클래스에서 인터페이스 IDraw의 메소드를 오버라이드함");
		System.out.println(su);
	}
	
	public void show() {
//		su = 3000; //인터페이스에 있던 su는 상수이므로 값 변경이 불가능하다.
		System.out.println(su);
	}

}
