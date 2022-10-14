package quiz;

import java.util.Scanner;

public class QuizEx02 {
	public static void main(String[] args) {
		int SU = 30, sum = 0;
		double avg = 0;
		double[] arr = new double[SU];
		System.out.println("일일 강수량을 입력하세요");
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println(i+1 + "일 강수량을 입력하세요");
			arr[i] = new Scanner(System.in).nextDouble();
			sum += arr[i];
			avg = (double)sum /arr.length;
		}
		System.out.println("8월 평균 강수량 : " + avg);
	}
}
