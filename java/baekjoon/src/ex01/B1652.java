package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class B1652 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] arr = new int[101][101];
        int col = 0;
        int row = 0;
        for (int i = 0; i < N; i++) { //값저장
            String str = sc.next();
            for (int j = 0; j < N; j++) {
                arr[i][j] = str.charAt(j);
            }
        }


        for (int i = 0; i < arr.length; i++) {//가로
            int cntRow = 0, cntCol = 0;
            for (int j = 0; j < arr.length; j++) { //가로
                if (arr[i][j] == '.')
                    cntCol++;
                if (arr[i][j] == 'X' || (j == N - 1)) {
                    if (cntCol >= 2) col++;
                    cntCol = 0;
                }

                //세로
                if (arr[j][i] == '.') {
                    cntRow++;
                }
                if (arr[j][i] == 'X' || (j == N - 1)) {
                    if (cntRow >= 2) row++;
                    cntRow = 0;
                }
            }

        }// end 가로
        System.out.println(col + " " + row);
    }
}
