package ex01;

import java.util.*;

public class B2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); //test case


        while (T > 0) {
            int k = sc.nextInt(); //층수
            int n = sc.nextInt(); //호수
            int a=1;
            int[][] arr = new int[15][15];   //0층 1호부터
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    if(i==0) {  //0층
                        arr[i][j] = j+1;
                    }
                    else {
                        for(int A=0; A<=j;A++){
                            arr[i][j] += arr[i-1][A];
                        }
                    }
                }
            }
            System.out.println(arr[k][n-1]);
            T--;
        }
    }
}

