package ex04.oop;

class Point {
	private int x, y;

	public void setX(int xx) {
		x = xx;
	}

	public int getX() {
		return x;
	}

	public void setY(int yy) {
		y = yy;
	}

	public int getY() {
		return y;
	}

	public void display() {
		System.out.println("x = " + getX() + " , " + "y = " + getY());
	}
}

class Circle {
	private int x, y, r;

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

	public int getR() {
		return r;
	}

	public void setR(int rr) {
		r = rr;
	}

	public void display() {
		System.out.println("x = " + getX() + " y = " + getY() + " r = " + getR());
	}

}

public class MainEntry {
	public static void main(String[] args) {
		Point pt = new Point(); // 객체 생성, 메모리에 할당, 생성자함수 자동 호출 pt는 object instance
		/*System.out.println(pt.getX() + " , " + pt.getY());
		pt.setX(10);
		pt.setY(5);
		System.out.println(pt.getX() + " , " + pt.getY());
		*/
		pt.display();
		pt.setX(10);
		pt.setY(5);
		pt.display();

		Circle cr = new Circle();
		cr.setX(10);
		cr.setY(30);
		cr.setR(50);
		cr.display();

	}

}
