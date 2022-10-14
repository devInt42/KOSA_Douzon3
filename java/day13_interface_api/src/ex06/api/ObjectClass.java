package ex06.api;

class Point{	}



public class ObjectClass {
	public static void main(String[] args) {
		Point pt = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt.getClass());
		System.out.println("hash code : " + pt.hashCode());
		System.out.println("Object String : " + pt.toString());
		System.out.println("Object String : " + pt);
		System.out.printf("10진수 %d\n", 0x626b2d4a);		// 23 십진수, 023 8진수,  0x23 16진수
		System.out.println("========================================");
		
		
		Point pt2 = new Point();
		System.out.println("Point pt information");
		System.out.println("class name : " + pt2.getClass());
		System.out.println("hash code : " + pt2.hashCode());
		System.out.println("Object String : " + pt2.toString());
		System.out.println("Object String : " + pt2);
		System.out.printf("10진수 %d\n", 0x7a79be86);		// 23 십진수, 023 8진수,  0x23 16진수
		System.out.println("========================================");
		
		System.out.println("pt2.toString() : toString()의 의미");
		System.out.println(pt2.getClass().getName()+ '@' + Integer.toHexString(pt2.hashCode()));
		
		Point pt3= new Point();
		if(pt.hashCode()==pt3.hashCode()) {
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
		
		Point pt4;
		pt4 = pt; //
		if(pt.hashCode()==pt4.hashCode()) {
			System.out.println("========================================");
			System.out.println("save");
		} else {
			System.out.println("not save");
		}
	}
}
