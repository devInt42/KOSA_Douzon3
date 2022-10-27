package ex06.aop.annot;

public class Student {  // 학생 클래스
	
	private String name;
	private int age, gradeNum, classNum;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {   // DI
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getGradeNum() {
		return gradeNum;
	}
	public void setGradeNum(int gradeNum) {
		this.gradeNum = gradeNum;
	}
	public int getClassNum() {
		return classNum;
	}
	public void setClassNum(int classNum) {
		this.classNum = classNum;
	}
	
	public void getStudentInfo() {
		System.out.println("이름 : " + getName() );
		System.out.println("나이 : " + age );
		System.out.println("학년 : " + getGradeNum() );
		System.out.println("반 : " + classNum );
	}

}
