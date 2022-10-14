//*
package quiz.two;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Score sj = new Score(); //객체생성, 메모리에할당, 생성자함수 자동호출
		sj.input();
		sj.process();
		sj.process();
		
//		Score sa = new Score();
//		sa.process();
//		
//		Score sb = new Score();
//		sb.process();
		sj.input();
		sj.process();
		
		sj.display();
		System.out.println("-----------------------");

//		sa.display();
//		sb.display();
	}
}
//*/

/*
package quiz.two;

import java.util.Scanner;

public class MainEntry {
	public static void main(String[] args) {
		Score sj = new Score(); //객체생성, 메모리에할당, 생성자함수 자동호출
		Scanner sc = new Scanner(System.in);
		System.out.print("##[학생 이름] : ");
		//String name = sc.next();
		sj.setName(sc.next());
		
		System.out.print("##[국어 점수] : ");
		int kor = sc.nextInt();
		System.out.print("##[영어 점수] : ");
		int eng = sc.nextInt();
		System.out.print("##[전산 점수] : ");
		int math = sc.nextInt();
		//sj.setName(name);
		sj.setKor(kor);
		sj.setEng(eng);
		sj.setMath(math);
		
		sj.process();
		sj.display();
	}
}
//*/