package ex03.colletion.map;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapEx1 {
	public static void main(String[] args) {
		HashMap map = new HashMap();
		map.put("kosa", "1234");
		map.put("kbs", "111");
		map.put("kbs", "1234");

		System.out.println(map);
		System.out.println(map.size());

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("id와 pw를 입력해주세요. ");
			System.out.print("id : ");
			String id = sc.nextLine().trim();
			System.out.print("password : ");
			String pwd = sc.nextLine().trim(); // 공백제거
			System.out.println();

			if (!map.containsKey(id)) {
				System.out.println("입력하신 id는 존재하지 않습니다. 다시 입력해주세요. ");
				continue;
			} else {
				if ((map.get(id)).equals(pwd)) {
					System.out.println("비밀번호가 일치하지 않습니다 . 다시 입력해주세요.");
				} else {
					System.out.println("id와 password가 일치합니다");
					break;
				}
			}

		} // end while
	}
}
