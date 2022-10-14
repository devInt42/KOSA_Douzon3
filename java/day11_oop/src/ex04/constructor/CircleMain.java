package ex04.constructor;

public class CircleMain {
	public static void main(String[] args) {
		Circle c = new Circle(2);
		Circle c2 = new Circle(100,100,5);
		Circle c3 = new Circle(20,30);
		
		c2.disp();
		c.disp();
		c3.disp();
	}
}
