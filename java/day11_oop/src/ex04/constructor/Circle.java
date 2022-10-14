package ex04.constructor;

public class Circle {
	private int x, y, r;

	public Circle() {
		this(100, 100, 5);
//		x= y = 100; r = 5;
	}

	public Circle(int x, int y, int r) {
		super();
		this.x = x;
		this.y = y;
		this.r = r;
	}

	public Circle(int x) {
		super();
		this.x = x;
	}

	public Circle(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void disp() {
		System.out.println(x + ", " + y + ", " + r);
	}
}
