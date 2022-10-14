package quiz.two;

import java.util.Scanner;

public class Score {
	
	private int kor, eng, math;
    private double avg;
    private char grade;
    private String name;
    
    // 생성자함수 - 디폴트
//    public Score() {
//    	Scanner sc = new Scanner(System.in);
//		System.out.print("##[학생 이름] : ");
//		//String name = sc.next();
//		setName(sc.next());
//		
//		System.out.print("##[국어 점수] : ");
//		kor = sc.nextInt();
//		System.out.print("##[영어 점수] : ");
//		eng = sc.nextInt();
//		System.out.print("##[전산 점수] : ");
//		math = sc.nextInt();
//    }
    
    public void input() {
    	Scanner sc = new Scanner(System.in);
		System.out.print("##[학생 이름] : ");
		//String name = sc.next();
		setName(sc.next());
		
		System.out.print("##[국어 점수] : ");
		kor = sc.nextInt();
		System.out.print("##[영어 점수] : ");
		eng = sc.nextInt();
		System.out.print("##[전산 점수] : ");
		math = sc.nextInt();
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
    public int getMath() {
        return math;
    }
    public void setMath(int math) {
        this.math = math;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
    // 입력 
    
    
    // 계산
    public void process(){
    	
        avg = (kor + eng + math) / 3.;
        if (avg <= 100 && avg > 90) {
            grade = 'A';
        } else if (avg <= 90 && avg > 80) {
            grade = 'B';
        } else if (avg <= 80 && avg > 70) {
            grade = 'C';
        } else if (avg <= 70 && avg > 60) {
            grade = 'D';
        } else
            grade = 'F';
    }
    // 출력
    public void display(){
        System.out.println("===========================");
        System.out.println("[name] : " + name);
        System.out.println("[총 점] : "+ (kor+eng+math));
        System.out.printf("[평 균] : %.2f\n", avg);
        System.out.println("[학 점] : " + grade);
    }
}
