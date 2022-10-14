package ex04.operator;

// 최단산쉬관놈삼대콤
public class MainEntry {
	public static void main(String[] args) {
		/*
		 * // shift 연산자 : << , >> , >>>
		 * 
		 * int x = 8; int y = 8; int result;
		 * 
		 * result = x << 2; // left shift : 원래값*2^bit수 System.out.println(result);
		 * 
		 * result = y >>3; // right shift : 원래값/2^bit수 System.out.println(result);
		 */

		/*
		 * //논리연산 int x=4, y=7;
		 * 
		 * System.out.println(x&y); System.out.println(x|y); System.out.println(x^y);
		 */

		/*
		 * int x=10, y=20, z=30; boolean result = true;
		 * 
		 * result = (x>y)&&(y>z); System.out.println(result);
		 * 
		 * result = (x<y)&&(y<z); System.out.println(result);
		 * 
		 * result = (x<y)||(y>z); System.out.println(result);
		 */

		/*
		// 삼항(조건) 연산자 : (조건)? 참:거짓;
		int x = 20, y = 10;
		String msg = null;

		msg = (x != y) ? "not same" : "same"; // 조건, 참:거짓

		System.out.println(msg);

		int a = 10, b = 20, c = 30, result;

		result = (a > b) ? a : (b>c)?  b:c; //조건을 여러개 넣을수도 있다.
		
		System.out.println(result);
		*/
		
		//대입(배정)연산자 : = , +=, -=,  *=,  /=,  >>=,  <<=,  %=
		int x = 3, y = 5, result;
		result = x+y;
		System.out.println(result);
		
		x +=y;  //x = x+y와 동일
		
		

	}

}
