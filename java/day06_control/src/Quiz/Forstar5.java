package Quiz;

public class Forstar5 {
	public static void main(String[] args) {
		for(int i=1; i<=11; i++) {	//row - 행
			System.out.println(i);
			for (int j=5; j>=i; j--) { // col - 열
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