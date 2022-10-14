package ex01;
import java.util.Scanner;
public class B1259 {
	// 22년 08월 09일
	// 더존비즈온 3기 류정수
	// 백준 1259번
	public static void main(String[] args) {
		char[] arr;		//입력값을 저장
		char[] arr2;	//입력값을 역수를 저장
		String str;
		int cnt;
		Scanner sc = new Scanner(System.in);
		while (true) {
			str = sc.next();
			arr = new char[str.length()];	
			arr2 = new char[str.length()];	
			cnt = 0;	//cnt 초기화
			int num = Integer.parseInt(str); // String을 정수로 변환
			if (num == 0) {// 0일 경우 종료
				break;
			}

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i);							//입력받은 str을 char로 저장
				arr2[str.length() - i - 1] = str.charAt(i);		//arr[]을 역순으로 저장
			}
			
			for (int i = 0; i < Math.round((double)arr.length/2); i++) {	// Math.round((double)arr.length/2  전체길이/2의 반올림수만큼 비교
				if (arr[i] == arr2[i]) {
					cnt++;
				}
			}
			if (cnt == Math.round((double)arr.length/2)) {	
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}

	}
}
