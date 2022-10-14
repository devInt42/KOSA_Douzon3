package quiz01;

import java.util.Scanner;

public class Regular extends Employee {
protected int sal;
Scanner sc = new Scanner(System.in);

	public int getSal() {
		return sal;
	}
	public void setSal(int sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "sal=" + sal +", "+  super.toString();
	}
	
	@Override
	public void input() {
		// TODO Auto-generated method stub
		super.input();
		System.out.println("연봉 : ");
		sal = sc.nextInt();
	}
	

	
	}
	
	
	

