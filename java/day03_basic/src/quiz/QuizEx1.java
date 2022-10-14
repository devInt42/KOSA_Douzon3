package quiz;

public class QuizEx1 {

	public static void main(String[] args) {

		/*
		 * int pay = 567890;
		 * 
		 * int man, cheon, baek, sip = 0;
		 * 
		 * man = pay / 10000; cheon = (pay % 10000) / 1000; baek = (pay % 1000) / 100;
		 * sip = (pay % 100) / 10; System.out.println("만원 : " + man + "장");
		 * System.out.println("천원 : " + cheon + "장"); System.out.println("백원 : " + baek
		 * + "개"); System.out.println("십원 : " + sip + "개");
		 */

		
		int su = 12345;
		int si, bun, cho;
		
		si = su/3600;
		bun = (su%3600)/60;
		cho = su%60;
		
		System.out.println("시 : " + si);
		System.out.println("분 : " + bun);
		System.out.println("초 : " + cho);

	}

}
