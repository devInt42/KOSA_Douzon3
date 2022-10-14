package ex01;

import java.util.Scanner;

public class B2609 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int gcd = GCD(num1, num2); //최대공약수

        System.out.println(gcd);
        System.out.println(num1*num2/gcd);
    }
    public static int GCD(int num1, int num2){
        if(num2==0) return num1;
        return GCD(num2,num1%num2);
    }
}

