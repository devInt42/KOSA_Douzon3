package ex01;

import java.util.*;

//22년 08월 23일
//더존비즈온 3기 류정수
//백준 1316번
public class B1316 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int N = sc.nextInt(); //단어의 갯수
        String[] str = new String[N];
        int res = 0;
        for (int i = 0; i < N; i++) {
            if (Checker() == true) {
                res++;
            }
        }
        System.out.println(res);
    }

    public static boolean Checker() {
        boolean[] flag = new boolean[26];   //알파벳 26개만큼 배열 정의
        int cnt = 0;
        String str = sc.next();

        for (int i = 0; i < str.length(); i++) {
            int arr = str.charAt(i);
            if (cnt != arr) {      // 앞선 문자와 i 번째 문자가 같지 않을 경우

                if (flag[arr - 'a'] == false) {     // 문자가 처음 나오는 경우
                    flag[arr - 'a'] = true;
                    cnt = arr;
                } else {
                    return false;
                }
            } else {
                continue;
            }
        }
        return true;
    }
}

