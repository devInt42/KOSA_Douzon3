package ex01;

import java.util.Scanner;
//22년 08월 25일
//더존비즈온 3기 류정수
//백준 2292번
public class B2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = 1;
        int finish = 1;
        int room = 1;
        int res=0;
        int num = sc.nextInt();
        while (true) {
            for (int i = start; i <= finish; i++) {
                if (i == num) {
                    res=i;
                }
            }
            if (res==num) {
                System.out.println(room);
                break;
            }
            start = finish + 1;
            finish +=  6 * room;
            room++;

        }


    }
}

