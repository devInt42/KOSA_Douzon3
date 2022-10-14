package ex01_array;

public class MainEntry {
	public static void main(String[] args) {
		//1.
		char[] ch; // 배열 선언
		ch = new char[4]; //배열 생성, 메모리에 할당
		
		//2.
		char[] ch2 = new char[4]; //배열 선언 및 생성
		//배열초기화
		
		ch2[0] = 'J';
		ch2[1] = 'A';
		ch2[2] = 'V';
		ch2[3] = 'A';
		
		System.out.println(ch2[0]);
		System.out.println(ch2[1]);
		System.out.println("========================================");
		for(int i = 0 ; i < 4 ; i++) {
			System.out.println(ch2[i]);
		}
		System.out.println("========================================");
		String[] str2 = new String[] {"a","kbs","park","D","you","mbc","sbs","KOSA"};
		for (int i = 0 ; i <str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		
		//3.
		char[] ch3;
		
		
	}
}
