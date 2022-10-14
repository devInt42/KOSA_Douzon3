package Quiz;

public class Forstar2 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {	//row - 행
			for (int j=5; j>=i; j--) { // col - 열
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
/*
 

***** 
****
***
**
*

*/