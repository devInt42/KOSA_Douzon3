package ex01;

import java.util.Scanner;

public class B15829 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long L = sc.nextInt();
        long[] arr = new long[(int) L];
        String str = sc.next();
        for(int i=0;i<arr.length;i++){
            arr[i] = (int)str.charAt(i)-96;
        }
        long res;
        long pow =1;
        long sum=0;
        for(int i=0;i<arr.length;i++){
            res = arr[i]*pow;
            pow=(pow*31)%1234567891;
            sum += res;
        }
        System.out.println(sum%1234567891);

    }

}

