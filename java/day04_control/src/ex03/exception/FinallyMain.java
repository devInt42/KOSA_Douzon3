package ex03.exception;

import java.util.InputMismatchException;
import java.util.MissingResourceException;
import java.util.Scanner;

public class FinallyMain {
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
		} catch (InputMismatchException e) {
			System.out.println("InputMismatchException");
		} catch (Exception e) {
			System.out.println("Exception");
		} finally {
			System.out.println("finally 무조건 처리됨");
		}
	}
}
