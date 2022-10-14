package ex01.method;

public class MethodTest {
	
//	3) 매개변수 없고, 리턴타입 있는 경우
//	public returnType methodName( ) {  return  value;  }
	public static String show() {
		return "Hello DouZone";
	}
	
	public static int iShow() {
		int su = 200;
		//return 100;
		//return su;
		return su + 99;
	}
	
//	4) 매개변수 있고, 리턴타입 있는 경우
//    public returnType methodName(parameter var1, parameter var2,....  ) 	{  return  value;  }
	public static int plus(int x, int y) {
		int hap = x + y;
		return  hap;   //x + y;
	}
	
	public static double add(int x, int y) {
		return  x + y;
	}
	
	public static void main(String[] args) {
		System.out.println(add(3, 7));
		
		System.out.println("====================");
		int sum = plus(3, 5);
		System.out.println(sum);
		
		String str = show();
		System.out.println(str);
		System.out.println(show());
		System.out.println(iShow());
		int num = iShow();
		System.out.println("iShow() = " + num);
	}
}








