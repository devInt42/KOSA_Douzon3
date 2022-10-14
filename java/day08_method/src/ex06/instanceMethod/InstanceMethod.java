package ex06.instanceMethod;

class B {
	int x, y;

	// instance method
	public void setData(int xx, int yy) {
		System.out.println(xx + "," + yy);
	}

}// B class end

public class InstanceMethod {
	public static void main(String[] args) {
		B b = new B(); // 객체생성, 메모리 할당, 생성자함수 자동 호출 b를 인스턴스 혹은 오브젝트라고 부른다.
		b.setData(100, 200);
	}
}
