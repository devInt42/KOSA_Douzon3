package ex01.inhertance;

public class Circle extends Point {
	private int r;
//	private Point pt;

	public Circle() {
		r = 5;
		System.out.println("Circle Sub class call!!!!");
	}

	public Circle(int r) {
//		super();
		this.r = r;
		System.out.println("Circle 매개변수 1개짜리 생성자함수 call~~~");
	}

	public Circle(int x, int y, int r) {
		super(x, y);
		this.r = r;
		System.out.println("Circle 매개변수 3개짜리 생성자함수 call~~~");
	}

	public Circle(int x, int r) {
		super(x);
		this.r = r;
		System.out.println("Circle 매개변수 2개짜리 생성자함수 call~~~");
	}

	@Override
	public String toString() {
		return "Circle [r=" + r + ", x=" + x + ", y=" + y + "]";
	}
	
	

//	@Override
//	public String toString() {
//		String str = "toString() : " + x + ", " + y + ", " + r ;
//		return str;
//	}
	
	

//	@Override
//	public void disp() {
//		super.disp();
//		System.out.print(", " + r);
//	}
	
	
	
//	public void disp(){
//		super.disp();
//		System.out.print(", " + r);
//		System.out.println();
////		super.setX(100);
//	}

}
