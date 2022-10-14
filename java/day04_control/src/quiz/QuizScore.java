package quiz;

import java.util.Scanner;

public class QuizScore {

	public static void main(String[] args) {

		System.out.println("이름, 국어, 영어, 전산값");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int com = sc.nextInt();
		char score;
		
		int tot = 0;
		double avg;
		tot = kor + eng + com;
		avg = tot / 3;
		
		
		   score = (avg>=90)? 'A' :
		   	(avg>=80)? 'B' :
		   		(avg>=70)? 'C' :
		   			(avg>=60)? 'D' : 
		   				'F';
		 
		
		/*
		if (avg >= 90) {	
			score = "A";
		}
		else if(avg >=80) {
			score = "B";
		}
		else if(avg >=70) {
			score = "C";
		}
		else if(avg >=60) {
			score = "D";
		}
		else
			score = "F";
*/
		
		System.out.println(name + "님의 성적표 ******");
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d \n", kor, eng, com);
		System.out.printf("총점 : %d, 평균 : %.2f, 학점 : %s", tot, avg, score);

	}

	private static void charAt(int i) {
		// TODO Auto-generated method stub
		
	}

}
