package ex01;

import java.util.Arrays;
import java.util.Scanner;

public class B6996 {

    private static boolean solveAnagrams(String first, String second) {
        char[] arr1 = new char[first.length()];
        char[] arr2 = new char[second.length()];
        int cnt=0;
        if (arr1.length == arr2.length) {
            for (int i = 0; i < arr1.length; i++) {
                arr1[i] = first.charAt(i);
                arr2[i] = second.charAt(i);
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    cnt++;
                }
            }
        } else {
            return false;
        }
        if(cnt==0){
        return true;}
        else{
            return false;}
        /* -------------------- END OF INSERTION --------------------*/
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numTests = sc.nextInt();

        for (int i = 0; i < numTests; i++) {
            String first = sc.next().toLowerCase();
            String second = sc.next().toLowerCase();

            System.out.println(first + " & " + second + " are " + (solveAnagrams(first, second) ? "anagrams." : "NOT anagrams."));
        }
    }
}
