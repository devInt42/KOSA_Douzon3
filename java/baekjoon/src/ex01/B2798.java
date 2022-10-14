package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class B2798 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int max= sc.nextInt();
        int res=0;
        int sum=0;
        int[] arr = new int[num];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length-2;i++){
            for(int j=i+1;j<arr.length-1;j++){
                for(int k=j+1;k<arr.length;k++){
                    sum=arr[i]+arr[j]+arr[k];
                    if(sum>res&&sum<=max){
                        res = sum;
                    }
                }
            }
        }
        System.out.println(res);


    }
}

