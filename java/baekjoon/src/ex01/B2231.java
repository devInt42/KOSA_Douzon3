package ex01;
import java.util.Arrays;
import java.util.Scanner;

public class B2231 {
    public static void main(String[] args) {
        int res = 0;
        int cnt = 0;

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Number(i);
            if(arr[i]==num){
                res = i;
                break;
            }
        }
        System.out.println(res);

    }


    public static int Number(int num) {
        int sum = num;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;
    }

}