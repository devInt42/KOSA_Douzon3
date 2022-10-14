package quiz01;

import java.util.*;

public class PartTime extends Employee {
	private int time, won, pay;

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public int getWon() {
		return won;
	}

	public void setWon(int won) {
		this.won = won;
	}

	public int getPay() {
		return pay;
	}

	public void setPay(int pay) {
		this.pay = pay;
	}

	@Override
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("시급 : ");
		won = sc.nextInt();
		System.out.println("일한시간 : ");
		time = sc.nextInt();
		pay = won * time;

	}

	public String toString() {
		return super.toString() + ", "+"급여: " + pay ;
	}

}