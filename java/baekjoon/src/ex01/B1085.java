package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class B1085 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int w,h,x,y;
        Scanner sc = new Scanner(System.in);
        int min1, min2;

        x= sc.nextInt();
        y=sc.nextInt();
        w=sc.nextInt();
        h=sc.nextInt();

        min1 = x>y?  y : x;
        min2 = (w-x)>(h-y)? (h-y) : (w-x);

        if (min1>min2){
            System.out.println(min2);
        }
        else System.out.println(min1);

    }
}