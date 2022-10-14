package quiz;

import java.util.Scanner;

public class ScoreSwitch {

	public static void main(String[] args) {

		System.out.println("이름, 국어, 영어, 전산값");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		char score = 0;

		int tot = 0;
		double avg;
		tot = kor + eng + com;
		avg = tot / 3;

		switch ((int) avg / 10) {	//10으로 나눈 몫을 구하면 90~99범위 구할수있다.
		case 10:
			score = 'A';
			break;
		case 9:
			score = 'A';
			break;
		case 8:
			score = 'B';
			break;
		case 7:
			score = 'C';
			break;
		case 6:
			score = 'D';
			break;
		default :
			score = 'F';
		}
		System.out.println(name + "님의 성적표 ******");
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d \n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s", tot, avg, score);
	}

}
