package quiz;

import java.util.Scanner;

public class ScoreMethod {
	static int[] score = new int[3]; // 점수를 저장할 배열을 전역변수로 할당
	static String name;	// 이름저장

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean repeat = false;
		do {
			input();
			output(score);
			System.out.print("계속 하려면 y또는Y를 입력해주세요");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y')
				repeat = true;
			else repeat = false;
		} while (repeat);
	}

	public static void input( ) {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름을 입력하세요 : ");
		name = sc.next();
		for (int i = 0; i < 3; i++) {
			switch (i) {
			case 0:
				System.out.print("국어점수 입력: ");
				break;
			case 1:
				System.out.print("영어점수 입력: ");
				break;
			case 2:
				System.out.print("전산점수 입력: ");
				break;
			}
			score[i] = sc.nextInt();
		}
	}

	public static void output(int[] args) {
		int tot = totScore(args);
		double avg = avgScore(tot, 3);
		String grade = getGrade(avg);
		line();
		System.out.println("이름 : " + name);
		for (int i = 0; i < args.length; i++) {
			String subject = null;
			switch (i) {
			case 0:
				subject = "국어";
				break;
			case 1:
				subject = "영어";
				break;
			case 2:
				subject = "전산";
				break;
			}
			System.out.print(subject + " 점수 : " + args[i] + "점 \t\t");
		}
		System.out.println("\n총점 : " + tot + "점" + " \t평균 :  " + avg + "점");
		System.out.println("학점 : " + grade);

	}

	public static int totScore(int... args) {
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		return sum;
	}

	public static double avgScore(int total, int n) {
		return (double) (total) / n;
	}

	public static String getGrade(double avg) {
		String grade = null;
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		return grade;

	}

	public static void line() {
		System.out.println("==================================");
	}
}