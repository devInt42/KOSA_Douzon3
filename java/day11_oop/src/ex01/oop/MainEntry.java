package ex01.oop;


class Circle {
	private int x, y, r;

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

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}
	
	public void display() {
		System.out.println(x + ", " + y + ", "+ r);
	}
}

public class MainEntry {

	public static void main(String[] args) {
		Point pt = new Point();
		pt.setX(20);  pt.setY(30);  pt.display();
		System.out.println("---------------------");
		
		Circle c = new Circle();
		c.setR(5);
		c.setX(100);
		c.setY(150);
		c.display();
		

	}

}


class Point {
	private int x, y;   // private < default < protected < public 
	
	public void setData(int xx, int yy) {
		x = xx;
		y = yy;
	}
	
	public int getX() {		return x;	}
	public void setX(int xx ) {
		x = xx;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void display() {
		System.out.println(x + ", " + y);
//		System.out.println(getX() + " : " + getY());
	}
}
