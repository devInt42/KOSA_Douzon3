package ex01;
import java.util.Scanner;

//22년 08월 04일
//더존비즈온 3기 류정수
//백준 11653번

public class B11653_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();	// 소인수분해할수

		while (num>1) {
			for (int i = 1; i <= num; i++) {
				if (num % i == 0 && i > 1) {	//나머지가 0인수를 발견했을때
					num = num / i;			
					System.out.println(i);
					i=i-1;
					break;								//break;
				}
			}// i end
		}// while
	}
}	