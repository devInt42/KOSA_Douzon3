package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[3][4];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if(i==2) {
					a[2][j] = a[0][j]+a[1][j];
				}else {
				System.out.printf(i+"열 "+j+"행 을 입력하세요  ");
				a[i][j] = sc.nextInt();
				}
			}
		}
	System.out.println(Arrays.deepToString(a));
	}
	
}
