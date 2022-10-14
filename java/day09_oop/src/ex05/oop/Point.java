package ex05.oop;

public class Point {
	private int x, y;

	public int getX() {
		return x;
	}

	public void setX(int xx) {
		x = xx;
	}

	public int getY() {
		return y;
	}

	public void setY(int yy) {
		y = yy;
	}

	public void display() {
		System.out.println("x = " + x + " , " + "y = " + y);
	}

}
