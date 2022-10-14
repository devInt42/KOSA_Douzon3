package Quiz;

public class Forstar3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++) {	//row - 행
			for (int j=1; j>=1; j++) { // col - 열
				if(i<=j)
					System.out.print("*");
				else System.out.print(" ");

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