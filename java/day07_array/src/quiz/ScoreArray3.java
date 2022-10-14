package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class ScoreArray3 {
	public static void main(String[] args) {
		int SU = 3, NO = 3;
		int[][] arr = new int[SU][NO];
		int[][] nUserInfo = new int[SU][NO];// 총,평,학
		String[] strName = new String[SU];
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < arr.length; i++) {
			System.out.printf("%d번째 학생 이름 입력: \n", i + 1);
			strName[i] = sc.next();
			for (int j = 0; j < arr[0].length; j++) {
				switch (j) {
				case 0:	System.out.print("국어점수 입력: ");
					break;
				case 1:	System.out.print("영어점수 입력: ");
					break;
				case 2:	System.out.print("전산점수 입력: ");
					break;
				}
				arr[i][j] = sc.nextInt();
				System.out.println(Arrays.deepToString(arr));
			}
		}

		int nSum = 0, nGrade = 0;
		double fAvg = 0;
		String strmsg = " ";
		char szGrade = ' ';
		
		for (int i = 0; i < arr.length; i++) {
			nSum = 0;
			fAvg = 0.0f;
			nGrade = 0;
			System.out.printf("[ %s ] 학생 점수 ==================\n ", strName[i]);
			for (int j = 0; j < arr[0].length; j++) {
				strmsg = " ";
				switch (j) {
					case 0:	strmsg = "국어 ";		break;
					case 1:	strmsg = "영어 ";		break;
					case 2:	strmsg = "전산 ";		break;
				}
				nSum += arr[i][j];
				System.out.printf("[ %s ] : %d \n", strmsg, arr[i][j]);
			} // end for 
			
			fAvg = (double) nSum / arr.length;
			nGrade = (int) fAvg / 10;
			switch (nGrade) {
				case 10:
				case 9:	szGrade = 'A';	break;
				case 8:	szGrade = 'B';		break;
				case 7:	szGrade = 'C';		break;
				case 6:	szGrade = 'D';	break;
				default:	szGrade = 'F';
			} // end switch
			
			System.out.println("\n**************** [ " + strName[i] + " ] 번 학생 점수 결과 ****************");
			System.out.printf("[ 총점: %d ]\t[ 평균: %.2f ]\t[ 학점 : %s ]\t", nSum, fAvg, szGrade);
			System.out.println("\n=================================================\n");
		}
	}
}
