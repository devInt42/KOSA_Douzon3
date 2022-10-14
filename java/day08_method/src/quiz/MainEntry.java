package quiz;

public class MainEntry {
	public static void info() {
		String name = "류정수";
		String phone = "010-9246-9642";
		String address = "경기도 남양주시 다산동";
		System.out.println("이름 : "+ name);
		System.out.println("전화번호 : "+ phone);
		System.out.println("집주소 : " + address);
	}
	
	public static void abs(int x) {
		if(x<0) x*=(-1);
		System.out.println("x의 절대값 : "+ x);
	}
	
	public static int max(int x, int y) {
		int maxnum = (x>y)? x:y;
		return maxnum;
	}
	
	public static int add(int x, int y) {
		return x+y;
	}
	public static int sub(int x, int y) {
		return x-y;
	}
	public static int mul(int x, int y) {
		return x*y;
	}
	public static double div(double x, double y){
		try{return x/y;
		} catch (ArithmeticException e) {
			return 0;
		}
	}
	public static void main(String[] args) {
		info();
		abs(-7);
		abs(8);
		System.out.println(max(7, 10));
		System.out.println(max(9, 1));
		System.out.println(add(1,3));
		System.out.println(sub(2,3));
		System.out.println(mul(3,3));
		System.out.println(div(1,3));
		System.out.println(div(1,0));


		
	}
}
