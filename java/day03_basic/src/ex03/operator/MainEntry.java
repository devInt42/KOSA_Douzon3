package ex03.operator;

public class MainEntry {

	public static void main(String[] args) {
		// 단항 연산자 : 증감 ==> ++, --, ~
		int x = 10, y;

		y = ~x; // 비트부정 -(원래값 +1) ====> 결과
		// y = x++; // 후위연산 : 대입 먼저, 연산 나중
		// y = ++x; // 전위 연산 : 연산 먼저, 대입 나중

		System.out.println("x = " + x + "\ty = " + y);

	}

}
