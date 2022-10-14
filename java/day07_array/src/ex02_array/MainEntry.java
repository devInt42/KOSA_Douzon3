package ex02_array;

import java.util.Arrays;

public class MainEntry {
	public static void main(String[] args) {
		int[][] a = new int[][] { { 1, 2, 3, 8, 7, 9, 55, 44, 100 }, { 4, 5, 6, 7, 80, 90 } };
		System.out.println("행 길이 : " + a.length);
		System.out.println("열 길이 : " + a[0].length); // 행.length

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print("a[" + i + "][" + j + "] = " + a[i][j] + "\t");
			}
			System.out.println("");
		}

	}
}
