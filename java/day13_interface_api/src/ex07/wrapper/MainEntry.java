package ex07.wrapper;

class Point {
}

public class MainEntry {
	public static void main(String[] args) {

		Integer Ia = new Integer(10);
		Integer Ib = new Integer("10");
		String su = "30";
		Point pt = new Point();

		System.out.println(pt);
		System.out.println(pt.toString());
		System.out.println(pt.hashCode());

		System.out.println(Ia);
		System.out.println(Ia.toString());
		System.out.println(Ia.getClass().getName() + '@' + Integer.toHexString(Ia.hashCode()));

		int y = 5;
		double d = 3.3;
		y = (int) d;

		int c = Ia.intValue();
		int e = Ib;
		int num = Integer.parseInt(su);

		System.out.println(c + num);
		System.out.println(c + e);
		System.out.println(Ia.MAX_VALUE);
		System.out.println(Ia.MIN_VALUE);
		
		Double dd = new Double(12.34);
		System.out.println("==========================================");
		System.out.println(dd.MAX_VALUE);
		System.out.println(dd.MIN_VALUE);
		System.out.println(Float.MIN_VALUE);
		
		c = (int)dd.doubleValue();
		System.out.println("형변환한 c의 값은? " + c);
		
		int f = Integer.parseInt("123");
		int g = Integer.parseInt("1111111", 2);
		System.out.println(f);
		System.out.println(g);
		
		int h = 3; //stack memory
		Integer i = new Integer(3);
		System.out.println("=============================");
		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.toOctalString(10));
		System.out.println(Integer.toHexString(10));

	}
}