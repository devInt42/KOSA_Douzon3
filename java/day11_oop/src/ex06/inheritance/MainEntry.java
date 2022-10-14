package ex06.inheritance;

class Point {//super class
	protected int x, y;	//보호모드	- 상속받은 자손은 접속 가능	
	public Point() {	//생성자 함수는 상속이 불가능
		System.out.println("Point default constructor");
	}
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

	public void disp() {
		System.out.println(x + ", " + y);
	}
}

class Circle extends Point {	//sub class
	private int r;
	
	public Circle() {System.out.println("Cirlce default constructor");}

	
	
	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
}


class Rect extends Point{
	private int x2, y2;
	public void disp() {
		System.out.println(x + ", " + y + ", " + x2 + "," + y2);
	}
}

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle();
		c.disp();
		
		Rect r = new Rect();
		r.disp();
		
	}

}
