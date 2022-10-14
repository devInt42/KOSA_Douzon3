package quiz;

import java.util.Scanner;

// 1차원 배열 이용
public class ScoreArray {
	public static void main(String[] args) {
		int INWON = 3;
		Scanner sc = new Scanner(System.in);  
		
		int[] kor = new int[INWON];
		int[] eng = new int[INWON];
		int[] com = new int[INWON];
		int[] total = new int[INWON];
		double[] avg = new double[INWON];
		String[] name = new String[INWON];
		char[] grade = new char[INWON];
		String[] subject = { "kor", "eng", "com" };
		// input
//		
		for (int i = 0; i < INWON; i++) {
			// 이름 
			System.out.print("name = ");
			name[i] = sc.next();
			// 과목 점수 
			for (int j = 0; j < subject.length; j++)	
				System.out.print(subject[j]+"= " );
			kor[i] = sc.nextInt();
			eng[i] = sc.nextInt();
			com[i] = sc.nextInt();
			// 총점/평균 계산 처리
			total[i] = kor[i]+eng[i]+com[i];
			avg[i] = (double) total[i] / INWON; 
			
			// 학점(평점) 
			switch( (int)avg[i] / 10) {
				case 10 :
				case  9 :  grade[i] = 'A'; break; 
				case  8 :  grade[i] = 'B'; break; 
				case  7 :  grade[i] = 'C'; break; 
				case  6 :  grade[i] = 'D'; break; 
				default : grade[i] = 'F';
			} // switch end
		}  // input for end
		
		// output
		line();
		for (int i = 0; i < INWON; i++) {
			System.out.println(name[i]+"님의 성적표 ***** ");
//			System.out.print(subject[i] );
			System.out.println("국어 : " + kor[i] + " 영어 : " + eng[i] + " 전산 : " + com[i]);
			System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c \n", total[i], avg[i], grade[i] );
			line();
		}
		
	}
	
	public static void line() {
		System.out.println("-------------------------------");
	}
}











