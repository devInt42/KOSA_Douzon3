package ex06.aop.annot;

public class Student {  // �л� Ŭ����
	
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
		System.out.println("�̸� : " + getName() );
		System.out.println("���� : " + age );
		System.out.println("�г� : " + getGradeNum() );
		System.out.println("�� : " + classNum );
	}

}
