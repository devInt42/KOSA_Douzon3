package ex01.dataType;

public class MainEntry {
	static int su3; // static 변수는 자동으로 초기화 된다. int =0, double = 0.0, String = null로

	public static void main(String[] args) {
		int su = 9; // 지역변수는 반드시 초기화한 후에 사용한다.
		char ch = 'A'; // '문자'
		String str = "KOREA";
		double d = 12.34;
		float f = 12.34f; // 기본적으로 소수점은 double로 인식하기 때문에 float을 사용하려면 숫자뒤에 f를 붙인다. ps. Long도 마찬가지로 l을
							// 붙여준다.

		System.out.println(su);
		System.out.println(ch);
		System.out.println(str);
		System.out.println(d);
		System.out.println();
		System.out.println(su + "," + ch + "," + str + "," + d);

		System.out.println(100); // int로 인식 4byte 할당
		System.out.println(4.5); // double로 인식 8byte 할당

	}

}
