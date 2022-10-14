package homework.two;

import java.util.Scanner;

public class MainEntry {  // View
	public static void main(String[] args) {
		int select=0;
		CustomerManager	CM = new CustomerManager();
		Scanner sc = new Scanner(System.in);
		while(select != 4){
			//member.disp();
			System.out.println("====== 회원 가입 정보 ======");
			System.out.println("11.추가   12. 삭제   13. 출력   14. 수정  0. 종료");
			System.out.print("번호 선택하세요. (11,12,13,14) : ");
			select = sc.nextInt();
			switch( select ){
			case 11 :
				CM.Cadd(); break;
			case 12 :
				System.out.print("삭제할 번호 입력하세요(int) : ");
				CM.Cdel(sc.nextInt());
				break;
			case 13 :
				CM.Cdisp(); break;
			case 14 :
				CM.Cchange(); break;
			case 0 : System.out.println("회원 가입을 종료합니다. ");
						System.exit(0); // 프로그램 강제 종료
			default :
				System.out.println("잘못 선택하셨습니다. 없는 번호 입니다."); break;
			} // switch end
		} // while end
		System.out.println("수고하셨습니다.");
		

	}

}
