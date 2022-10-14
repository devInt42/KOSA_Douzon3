package ex01;
import java.util.Scanner;

//22년 08월 04일
//더존비즈온 3기 류정수
//백준 11653번

public class B11653 {
	/*
	fac() 함수는 입력받은 n값을 나눠주는 것이 아니라 입력받은 n값을
	나눌수 있는 소인수 값을 찾는 역할
	*/
	public static int fac(int x) {	//소인수 분해를 진행할 함수
		for (int i = 1; i <= x; i++) {	// 1부터 x까지 
			if(x%i==0 && i>1) { // 나머지가 0인 소인수
				x = i;					//fac() 함수의 return값으로 지정
			break;						//값을 찾으면 for문에서 벗어남
			}
		}
		return x;
	}	//fac() end

	
	public static void main(String[] args) { // 메인메소드
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 소인수분해 할 수 입력 
		
		while (n > 1) {
			fac(n);
			System.out.println(fac(n));
			n= n / fac(n);	//n을 소인수로 분해해준다.
		}
	}
}