package Quiz;

public class Gugudan {
	public static void main(String[] args) {	//구구단 전체 출력하는 프로그램 작성
		for(int i= 1 ; i<=9 ; i++) {	// row = 행
			for(int j =2; j<=9;j++) { // col = 열
				System.out.print(j+" * " + i + " = " + j*i + "\t");
			}
			System.out.println(" ");
		}
	}
}
