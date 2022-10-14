package ex08_doWhile;

public class MainEntry {
	public static void main(String[] args) {
		int a=1, b=1;	//변수 초기화
		do {
			b=1; // 다중 while, do-while문인 경우 안쪽 변수의 초기화
			do {
				System.out.print(b+"\t");
				b++;
			} while(b<=3);	//문장 종결기호
			
			System.out.println();
			a++;
		} while(a<= 2); //조건
	}
}
