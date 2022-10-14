package ex01;

public class B4673 {
	public static void main(String[] args) {

		boolean[] arr = new boolean[10001]; // 1~10000이하이기 때문에 a[0]을 빼고 돌리기때문에 10001로
		// boolean[]의 기본값은 false
		for (int i = 1; i < arr.length; i++) {
			int n = selfNum(i);

			if (n < 10001) { // 10000보다 작은 수만
				arr[n] = true;
			}
		}
		for (int i = 1; i < 10001; i++) { // 1부터10000까지 돌려서 false만 출력
			if (arr[i] == false) {// ==는 관계비교연산자
				System.out.println(i);
			}
		}

	}

	public static int selfNum(int num) { // selfNumber를 찾아주는 메소드
		int sum = num;
		while (num != 0) {
			sum += num % 10; // number의 첫째 자리수
			num = num / 10; // 나누기로 첫째자리 수 제외
		}
		return sum; // int n이 된다
	}
}