package ex01.Interface;

interface A {
	int x = 9; // interface - abstract method, final member만 가질수 있다.
	static final int y = 7777;

	public void show();

	public abstract void disp();

	public int plus(int x, int y);
}

interface B {
	void view();

}

interface C {
	String name = "Integer";

	public void draw();
}

interface D extends B { // 인터페이이스 간에 상속에서도 extends 키워드
	void dview();
}

class Rect implements C {

	@Override
	public void draw() {
		System.out.println(name + "님 반가워요~~~");
	}

} // Rect end

class Shape{
	
}

class Multi extends Shape implements B, C, A{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int plus(int x, int y) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		System.out.println(name + "님 반가워요~~~");
		
	}

	@Override
	public void view() {
		System.out.println(name + "님 반가워요~~~");
		
	}
	
}


public class MainEntry {
	public static void main(String[] args) {
		Rect r = new Rect();
		r.draw();
		
		C rr = new Rect();
		rr.draw();
		System.out.println("=================");
		Multi m = new Multi();
		m.view();
		A a = new Multi();	//부모 인터페이스를 이용해서 자손클래스 객체 생성 가능
		
		
	}
}
