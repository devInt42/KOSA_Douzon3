package ex01;
import java.util.Scanner;
import java.util.Arrays;

//22년 08월 03일
//더존비즈온 3기 류정수
//백준 10870번

public class B10870 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(fib(sc.nextInt()));	//	함수 입력
	}
	
	public static int fib(int x) {	//피보나치 계산함수
		if(x==1) x=1;			//x=1 일경우 1
		else if(x==0) x=0;		//x=0일경우 0
		else {
			x=fib(x-1)+fib(x-2);		//ex) fib(5) = fib(4)- fib(3)
		}
		return x;
	}
}