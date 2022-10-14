package quiz;

import java.util.Scanner;

public class Employee {
	protected String name, hp, dept, title, sal;
	//이름, 전화번호, 부서, 직급, 연봉
	static Scanner sc = new Scanner(System.in);

	public Employee() {}
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
		System.out.println("연락처를 입력하세요 : ");
		this.hp = sc.next();
		System.out.println("직급을 입력하세요 : ");
		this.title = sc.next();
		System.out.println("급여를 입력하세요 : ");
		this.sal = sc.next();
	}
	public void input(String name){ }

}
