package ex01;

import java.util.Arrays;
import java.util.Scanner;

//22년 08월 01일
//더존비즈온 3기 류정수
//백준 1546번

public class B1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		double[] score = new double[num];	//원래 시험점수를 저장하는 배열
		double max = 0;	//시험점수의 최대값
		double[] score2 = new double[num];	//원래점수/최대값*100의 값을 저장하는 배열
		double tot = 0;	//총합
		double avg; // 평균

		for (int i = 0; i < num; i++) {	//for문을 통해 시험점수를 기입받은후 배열에 저장
			score[i] = sc.nextInt();
			if (score[i] > max)
				max = score[i];
		}

		for (int j = 0; j < num; j++) {	// 가짜점수를 저장
			score2[j] = (score[j] / max) * 100;
			tot += score2[j];
		}
		avg = tot / num;
		System.out.println(avg);
	}
}
