package ex01;
import java.util.Scanner;

//22년 08월 03일
//더존비즈온 3기 류정수
//백준 1152번

public class B1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int cnt = 1;
		char[] ch = new char[str.length()];
		for (int i = 0; i < str.length(); i++) {
			ch[i] = str.charAt(i);
			if (ch[i] == ' ') {
				cnt++;
			}
		}
		if (ch[0] == ' ')
			cnt--;
		if (ch[ch.length - 1] == ' ')
			cnt--;
		System.out.println(cnt);
	}
}