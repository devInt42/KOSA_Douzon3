package ex04.di;

import java.util.Scanner;

public class PlayerImpl implements Player {
	
	private String name, position, sport;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getSport() {
		return sport;
	}

	public void setSport(String sport) {
		this.sport = sport;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("선수 이름 : ");		this.name = sc.next();
		System.out.print("포지션 : ");			this.position = sc.next();
		System.out.print("종목 : ");				this.sport = sc.next();
	}

	@Override
	public void info() {
		System.out.println("\n-=-=-= 선수 정보 =-=-=-");
		System.out.println("선수 이름 : " + this.name);		
		System.out.println("포지션 : " + this.position);			
		System.out.println("종목 이름 : " + this.sport);		
	}

}






