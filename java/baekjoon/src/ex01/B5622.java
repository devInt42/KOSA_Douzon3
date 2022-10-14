package ex01;

import java.util.ArrayList;
import java.util.*;
//22년 08월 19일
//더존비즈온 3기 류정수
//백준 5622번
public class B5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] arr = new char[str.length()];		//입력받은 str길이반큼 배열생성
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);	//각각의 str을 char로 변환후 배열값으로 넣기
        }
        int cnt = 0;
        int sum = 0;
        for(int i=0;i<arr.length;i++) {
            switch (arr[i]) {
                case 'Z': case 'Y': case 'X':  case 'W':
                    sum += 1;
                case 'V': case 'U': case 'T':
                    sum += 1;
                case 'S': case 'R': case 'Q':  case 'P':
                    sum += 1;
                case 'M': case 'N': case 'O':
                    sum += 1;
                case 'J': case 'K': case 'L':
                    sum += 1;
                case 'G': case 'H': case 'I':
                    sum += 1;
                case 'D': case 'E': case 'F':
                    sum += 1;
                case 'A': case 'B': case 'C':
                    sum += 1;

                default : sum+=2;
            }
        }
        System.out.println(sum);
    }
}

