package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class B4344 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int C = sc.nextInt();
		int[] score;
		int student = 0;
		double tot = 0;
		double avg = 0;
		double res = 0;
		double[] result = new double[C];
		for (int i = 0; i < C; i++) {//testcase
			int cnt = 0;
			tot=0;
			student = sc.nextInt();
			score = new int[student];
			for (int j = 0; j < score.length; j++) { // int j for문은 학생 점수를 넣는
				score[j] = sc.nextInt();
				tot += score[j];
			} // j end
			avg = tot / student;

			for (int k = 0; k < score.length; k++) {
				if (score[k] > avg)
					cnt++;
			} // k end
			res = (double) cnt / (double) student * 100;
			result[i] = res;
		}//i end
		
		for (int i = 0; i < result.length; i++) {
			System.out.printf("%.3f", result[i]);
			System.out.print("%\n");
		}
	}
}