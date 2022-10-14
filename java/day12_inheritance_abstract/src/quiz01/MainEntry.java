package quiz01;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee e = new Employee();
		Regular r = new Regular();
		Sales s = new Sales();
		PartTime p = new PartTime();
		System.out.println("1. 정규직\t2. 영업직\t3. 계약직");
		int num = sc.nextInt();
		if(num==1) {//정규직
			r.input();
			System.out.println(r.toString());

		}
		else if(num==2) {//영업직
			s.input();
			System.out.println(s.toString());
		}
		else if(num==3) {//계약직
			p.input();
			System.out.println(p.toString());
		}
		
		
		
	}
}
