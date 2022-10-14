package codingTest;

import java.util.Scanner;
import java.io.FileInputStream;

class Solution {
	static int AnswerN;
	static int N = 10;

	public static void main(String args[]) throws Exception {
		// System.setIn(new FileInputStream("C:\sample_input.txt"));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt(); // 테스트 케이스수

		for (int test_case = 1; test_case <= T; test_case++) {
			N = sc.nextInt();
			sc.nextLine();
			int cnt = 0;
			char[][] pan = new char[N][N];
			for (int i = 0; i < N; i++) {
				pan[i] = sc.nextLine().replace(" ", "").toCharArray();
				for (int j = 0; j < pan.length; j++) {
				}
			} // 배열에 저장

			for (int i = 0; i < pan.length; i++) {
				for (int j = 0; j < pan[i].length; j++) {
					if (pan[i][j] == 'X') {
						if ((pan[i][j - 1] == 'H' || pan[i][j - 1] == 'L') && j > 1) {// 왼쪽
							if(pan[i][j-1]=='L') {
								
							}
							
							if (pan[i][j - 2] == 'H')
								cnt++;
							
						}
						if ((pan[i][j + 1] == 'H' || pan[i][j + 1] == 'L') && j < pan[i].length - 1) {// 오른쪽
							if (pan[i][j + 2] == 'H')
								cnt++;
						}
						if ((pan[i - 1][j] == 'H' || pan[i - 1][j] == 'L') && i > 1) {// 위
							if (pan[i - 2][j] == 'H')
								cnt++;
						}
						if ((pan[i + 1][j] == 'H' || pan[i + 1][j] == 'L') && i < pan.length - 1) {// 아래
							if (pan[i + 2][j] == 'H')
								cnt++;
						}
					}
				} // j end
			} // i end
			AnswerN = cnt;
			System.out.println("#" + test_case + " " + AnswerN);
		}
	}
}
