package ex01;
import java.util.Scanner;
import java.util.Arrays;

//22년 08월 05일
//더존비즈온 3기 류정수
//백준 10952번

public class B10952 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	        int A, B;
	       while(true){

	           A = sc.nextInt();
	           B = sc.nextInt();

	           if(A==0 && B==0){
	               sc.close();
	               break;
	           }
	           System.out.println(A+B);
	       }
	    }
}