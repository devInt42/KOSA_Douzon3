package quiz;

import java.util.Scanner;
//3의배수

public class TestScore {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("전산, 영어, 국어 점수를 입력 : ");
		int com = sc.nextInt();
		int eng = sc.nextInt();
		int kor = sc.nextInt();
		int tot = com + eng + kor;
		double avg = tot / 3;
		System.out.println("전산 : " + com + " 영어 : " + eng + " 국어 : " + kor);
		System.out.println("총점 : " + tot + " 평균 : " + avg);
		if (avg < 60 || com < 40 || eng < 40 || kor < 40) {
			if (com < 40) {
				System.out.println("전산 과목으로 인해 불합격입니다.");
			if (kor < 40) {
				System.out.println("국어 과목으로 인해 불합격입니다.");
				}
			if (eng < 40) {
				System.out.println("영어 과목으로 인해 불합격입니다.");
				}
			if (avg < 60) {
				System.out.println("평균 미달로 불합격 입니다.");
			}
		}
			else {
				System.out.println("축하합니다! 합격입니다!!");
			}

		}
	}
}
