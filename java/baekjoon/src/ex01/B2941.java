package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

//22년 08월 22일
//더존비즈온 3기 류정수
//백준 2941번
public class B2941 {
	public static void main(String[] args) throws IOException {
		int cnt = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char[] arr = new char[str.length()];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}

		for (int i = 0; i < arr.length; i++) {
			cnt++;
			if (i < (arr.length - 1)) { // ArrayIndexOutOfBounds 예방
				if (arr[i] == 'c' && arr[i + 1] == '=') {
					cnt--;
				} else if (arr[i] == 'c' && arr[i + 1] == '-') {
					cnt--;
				} else if (arr[i] == 'd' && arr[i + 1] == '-') {
					cnt--;
				} else if (arr[i] == 'l' && arr[i + 1] == 'j') {
					cnt--;
				} else if (arr[i] == 'n' && arr[i + 1] == 'j') {
					cnt--;
				} else if (arr[i] == 's' && arr[i + 1] == '=') {
					cnt--;
				} else if (arr[i] == 'z' && arr[i + 1] == '=') { // z=과 dz=에 대한 조건
					cnt--;
					if (i > 0 && arr[i - 1] == 'd') {// ArrayIndexOutOfBounds 예방
						cnt--;
					}
				}
			}
		}
		System.out.println(cnt);
	}
}
