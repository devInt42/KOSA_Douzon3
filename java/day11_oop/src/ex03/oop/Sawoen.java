package ex03.oop;

import java.util.Scanner;

public class Sawoen {

	public Sawoen() {
		name = "noName";
		depart = "전산";
		phoneNum = "000-0000-000";
		pay = 10000;
		no = (int) (Math.random() * 10) + 1;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	private String name, depart, phoneNum; // 이름, 부서, 연락처
	private int pay, no; // 연봉 사번

	public void display() {
		String members = "Sawoen [name=" + name + ", depart=" + depart + ", phoneNum=" + phoneNum + ", pay=" + pay
				+ ", no=" + no + "]";
		System.out.println(members);
	}
	
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 : ");
		setName(sc.next());
		System.out.println("부서 : ");
		setDepart(sc.next());
		System.out.println("연봉 : ");
		setPay(sc.nextInt());
		System.out.println("연락처 : ");
		setPhoneNum(sc.next());
				
	}
	
}
