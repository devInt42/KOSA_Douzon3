package quiz;

import java.util.Scanner;

class Score {
	// 멤버 변수 선언
	private String name;
	private int kor, eng, com, tot;
	private double avg;
	private char grade;

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = kor + eng + com;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg/3;
	}

	public char getGrade() {
		return grade;
	}

	public void setGrade(char grade) {
		double avg = getAvg();
		switch ((int) avg / 10) {
		case 10:
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
		case 6:
			grade = 'D';
			break;
		default:
			grade = 'F';
		}
		this.grade = grade;
	}

	// 각 멤버 변수의 멤버함수
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getCom() {
		return com;
	}

	public void setCom(int com) {
		this.com = com;
	}

	// 출력함수
	public void output() {
		setTot(kor+eng+com);
		setAvg(tot);
		setGrade(grade);
		System.out.println("이름 : " + name);
		System.out.println("국어 점수 : " + kor + "\t\t영어점수 : " + eng + "\t\t전산점수 : " + com);
		System.out.printf("총점 : %d 평균 : %.1f  평점(학점) : %c \n", getTot(), getAvg(), getGrade());

	}

}// class Score

public class ScoreClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// score class object create
		Score s = new Score();
		// data value setting
		boolean repeat = false;
		do {

			System.out.println("이름을 입력하세요 : ");
			s.setName(sc.next());
			System.out.println("국어 점수  : ");
			s.setKor(sc.nextInt());
			System.out.println("영어 점수  : ");
			s.setEng(sc.nextInt());
			System.out.println("전산 점수  : ");
			s.setCom(sc.nextInt());
			// score output
			s.output();
			System.out.print("계속 하려면 y또는Y를 입력해주세요");
			char ch = sc.next().charAt(0);
			if (ch == 'y' || ch == 'Y')
				repeat = true;
			else
				repeat = false;
		} while (repeat);
	}
}
