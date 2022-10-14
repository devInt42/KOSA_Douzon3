package ex01.inhertance;

public class Point { //extends Object {
	protected int x, y;
	
	public Point() {
		x = y = 100;
		System.out.println("Point Super class call~~~");
	}

	public Point(int x, int y) {
//		super();
		this.x = x;
		this.y = y;
		System.out.println("Point 매개변수 2개짜리 생성자함수 call~~~");
	}

	public Point(int x) {
//		super();
		this.x = x;
		System.out.println("Point 매개변수 1개짜리 생성자함수 call~~~");
	}
	
//	public void disp(){
//		System.out.print(x + ", " + y + "\t");
//	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	
}
