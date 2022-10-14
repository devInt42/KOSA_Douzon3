package quiz;

import java.io.*;
import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		while (true) {
			System.out.print("" + "<1>Emp 추가 <2>Emp 출력 <3>Emp 수정 <4>Emp 삭제 <5>EXIT : ");

			switch (new Scanner(System.in).nextInt()) {
			case 1:
				EmployeeManager.insert();
				break;
			case 2:
				EmployeeManager.print();
				break;
			case 3:
				EmployeeManager.modify();
				break;
			case 4:
				EmployeeManager.delete();
				break;
			case 5:
				EmployeeManager.save();
				System.exit(0);
				break;
			} // switch end
		} // while end
	}
}
