package ex04.sort;

public class SelectionSort {
	public static void main(String[] args) {
		int[] a = { 7, 3, 5, 2, 8 };
		System.out.println("*********** sort 전 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) { // 교환
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			} // j end
		} // i end
		System.out.println("\n********* sort 후 출력");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "\t");
		}

	
		

	}
}
