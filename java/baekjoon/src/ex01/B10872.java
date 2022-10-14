package ex01;

import java.util.Scanner;

public class B10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fac=1;
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            fac *= i;
        }
        System.out.println(fac);
    }

}
