package homework.two;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerManager  {   // Controller
	ArrayList<Customer> list = new ArrayList<Customer>();
	Scanner sc = new Scanner(System.in);

	public void Cadd() {  // 추가 - insert
		list.add(new Customer());
	}

	public void Cdel(int i) {  // 삭제 - delete
		list.remove(i);
	}

	public void Cdisp() {  // select 
		System.out.println("\n[회원수는 " + list.size() + "명]");
		System.out.println("회원 정보 출력합니다.");
		System.out.println("---------------------------------------------");
		for (int i = 0; i < list.size(); i++) {
			Customer custom = list.get(i);
			System.out.println("  " + i + "    " + custom.name + "     "
					+ custom.address + "     " + custom.tel);
		}
		System.out.println("---------------------------------------------\n");
	}
	public void Cchange() {  // 수정 - update
		try {
			Cdisp();
			
			System.out.print("수정할 데이터의 번호를 입력하세요(int) : ");
			int n = sc.nextInt();
			Customer custom = list.get(n);
			System.out.print("이름 : ");
			custom.name=sc.next();
			System.out.print("주소 : ");
			custom.address=sc.next();
			System.out.print("전화번호 : ");
			custom.tel=sc.next();
			list.set(n, custom);
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
}
