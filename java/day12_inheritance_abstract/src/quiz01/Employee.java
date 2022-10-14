package quiz01;

import java.util.Scanner;

public class Employee {
	protected int empNo;
	protected String name, dept, phone;
	Scanner sc = new Scanner(System.in);
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void input() {
		System.out.println("이름 : ");
		name = sc.next();
		System.out.println("부서 : ");
		dept = sc.next();
		System.out.println("연락처 : ");
		phone = sc.next();
		System.out.println("사번 : ");
		empNo = sc.nextInt();
	}

	@Override
	public String toString() {
		return "empNo=" + empNo + ", name=" + name + ", dept=" + dept + ", phone=" + phone;
	}



}
