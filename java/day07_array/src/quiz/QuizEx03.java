package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class QuizEx03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] a = new int[2][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println(i+"열 "+j+"행 을 입력하세요");
				a[i][j] = sc.nextInt();
			}
		}
	System.out.println(Arrays.deepToString(a));	//배열값 한번에 출력
	}
	
}
