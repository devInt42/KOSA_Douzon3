package ex03.array;

public class MainEntry {
	public static void main(String[] args) {
		// 1
		int[][][] a = new int[2][2][3]; // 면 행 열

		// 2
		int[][][] a2 = new int[][][] { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 2, 3 }, { 4, 5, 6 } } };

		// 3.
		int[][][] a3 = { { { 1, 2, 3 }, { 4, 5, 6 } }, { { 1, 2, 3 }, { 4, 5, 6 } } };

		System.out.println("면길이 : " + a3.length); // 면길이
		System.out.println("행길이 : " + a3[0].length); // 행길이
		System.out.println("열길이 : " + a3[0][0].length); // 열길이
		System.out.println("열길이 : " + a3[1][0].length);

		for (int i = 0; i < a3.length; i++) { // 면

			for (int j = 0; j < a3[i].length; j++) {// 행

				for (int k = 0; k < a3[i][j].length ; k++) {// 열

				}
			}
		}

	}
}
