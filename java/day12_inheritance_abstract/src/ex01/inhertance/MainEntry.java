package ex01.inhertance;

public class MainEntry {
	public static void main(String[] args) {
		Circle c = new Circle(10);
//		c.disp();
		System.out.println(c); //c.toString();
		
		Circle c2 = new Circle(1,2,3);
//		c2.disp();
		System.out.println(c2.toString());
		
//		Circle c3 = new Circle(10,20);
//		c3.disp();
//		
//		Point pt = new Point();
//		pt.disp();
	}
}
