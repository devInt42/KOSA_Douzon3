package ex01;
import java.util.Scanner;
import java.util.Arrays;

//22년 08월 03일
//더존비즈온 3기 류정수
//백준 11650번
public class B11650 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 첫째 줄 점의 개수
		int[][] arr = new int[N][2]; // 행 x좌표 열 y좌표
		
		for (int i = 0; i < N; i++) {	
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();		//배열에 좌표값 입력
			}//j end
		}// i end
		System.out.println(Arrays.deepToString(arr));
	}
}