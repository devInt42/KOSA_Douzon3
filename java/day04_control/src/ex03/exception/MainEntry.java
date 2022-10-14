package ex03.exception;

import java.util.*;

public class MainEntry {
	public static void main(String[] args) {
		System.out.println("x,y =");
		int x, y, result = 0;

		try {
			
			x = new Scanner(System.in).nextInt();
			y = new Scanner(System.in).nextInt();
			result = x / y;
			System.out.println("\n\n result = " + result);
		} catch (MissingResourceException e) {
			System.out.println("MissingResourceException");
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
		}	catch(InputMismatchException e) {
			System.out.println("InputMismatchException");
		}
		catch (Exception e) {
			System.out.println("Exception");
		}
		/*
		 * try { x = new Scanner(System.in).nextInt(); y = new
		 * Scanner(System.in).nextInt(); result = x / y;
		 * System.out.println("\n\n result = " + result);
		 * 
		 * } catch (Exception e) { //System.out.println("잘못된 연산입니다."); //user messagae처리
		 * //System.out.println(e.getMessage()); //2번째 방법 e.printStackTrace(); //이게
		 * 개꿀이네~
		 */
	}
}
