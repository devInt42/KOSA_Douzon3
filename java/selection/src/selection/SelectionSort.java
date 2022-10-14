package selection;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);

      int min; // 최솟값을 저장할 변수
      System.out.print("배열의 크기를 입력해주세요");
      int[] arr = new int[sc.nextInt()];
      System.out.printf("%d개의 정수를 입력해주세요", arr.length);

      for (int i = 0; i < arr.length; i++) { // 배열에 값을 저장
         arr[i] = sc.nextInt();
      }
      System.out.println("=========초기 배열 상태 ==========");
      System.out.println(Arrays.toString(arr));

      for (int i = 0; i < arr.length - 1; i++) {
         min = i; // 회전을 시작할때 i번째 배열값을 최솟값으로 지정
         for (int j = i + 1; j < arr.length; j++) {//
            if (arr[j] < arr[min]) {
               min = j;
               
            }
         }

         // 회전이 끝나고 찾은 최소값과 현재 회전의 인덱스 위치의 배열값 교환
         int temp = arr[min];
         arr[min] = arr[i];
         arr[i] = temp;

         System.out.println((i + 1) + " 회전 " + Arrays.toString(arr) + "\t\t 현재 교환할 배열 인덱스 : "+ i + "    선택한 최소값 : " + arr[i]);
      }
      System.out.println("=====선=====택=====정=====렬=====");
      System.out.println(Arrays.toString(arr));
   }
}