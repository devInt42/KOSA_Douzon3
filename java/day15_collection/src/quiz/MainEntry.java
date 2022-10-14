package quiz;

import java.util.*;

class Customer {
	Scanner sc = new Scanner(System.in);
	private String name, address, tel;
	ArrayList list = new ArrayList();
	
	public void Input() {
		System.out.println("이름 : ");
		list.add(sc.next());
		sc.nextLine(); // 주소를 nextLine()으로 받기위해 넣음
		System.out.println("주소 : ");
		list.add(sc.nextLine());
		System.out.println("전화번호 : ");
		list.add(sc.next());
	}

	public void Delete() {
		System.out.println("삭제할 회원의 이름을 적어주세요");
		String name = sc.next();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals(name)) {
				list.remove(i);
				list.remove(i + 1);
				list.remove(i + 2);
				break;

			}
		}
	}

	public void Disp() {
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + "\t");
			if (i % 3 == 2) {
				System.out.println("");
			}

		}
	}

	public void Update() {
		System.out.println("수정할 회원의 이름을 적어주세요");
		String name = sc.next();
		System.out.println("수정하고싶은 항목을 기입하세요");
		System.out.println("1. 이름\t2. 주소\t3.전화번호");
		int num = sc.nextInt();
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).equals(name)) {
					System.out.println("수정할 내용을 입력해주세요");
					if (num == 1) {
						list.set(i, sc.next());
					} // 이름수정
					else if (num == 2) {
						list.set(i + 1, sc.next());
					} // 주소수정
					else if (num == 3) {
						list.set(i + 2, sc.next()); // 전화번호 수정
					}
				}
			}
	}// end update

}

public class MainEntry {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer cs = new Customer();
		while (true) {
			System.out.println("===========================================\n");
			System.out.println("1.고객 추가\t2.삭제\t3.리스트 출력\t4.수정\t5.종료");
			int num = sc.nextInt();
			if (num == 1)
				cs.Input();
			else if (num == 2)
				cs.Delete();
			else if (num == 3)
				cs.Disp();
			else if (num == 4)
				cs.Update();
			else if (num == 5) {
				System.out.println("종료");
				break;
			} else
				;

		}
	}
}
