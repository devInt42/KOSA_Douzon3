package ex05.staticMethod;

/*	static method : 객체 생성 없이 바로 사용 가능
 * object.methodName();
 * ClassName.methodName();
*/
class A {
	int x, y;

//static method
	public static void setData(int xx, int yy) {
		xx=50;
		yy=70;
		System.out.println(xx + "," + yy);
	}
}// A class end


public class StaticMethod {
	public static void main(String[] args) {
	A obj = new A(); //객체생성, 메모리에 할당, 생성자 함수 자동 호출
	obj.x= 9;
	System.out.println(obj.x);	//object.methodName()
	obj.setData(5, 7);
	A.setData(50, 70); //ClassNAme.methodName()
	}
}
