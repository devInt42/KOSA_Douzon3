package quiz2;

import java.io.IOException;
import java.util.*;

public class MainEntry {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		BmiManager bm = new BmiManager();
		while (true) {
			System.out.print("" + "<1>Bmi 추가 <2>Bmi 출력 <3>Bmi 수정 <4>Bmi 삭제 <5>EXIT : ");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				bm.input();
				break;
			case 2:
				bm.disp();
				break;
			case 3:
				bm.modify();
				break;
			case 4:
				bm.delete();
				break;
			case 5:
				bm.save();
				System.exit(0);
				break;

			}

		}
	}
}