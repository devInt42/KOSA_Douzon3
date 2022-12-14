package ex01.quiz;

import java.util.Scanner;

public class ScoreImpl implements IScore {
	private String name;
	private int music, art, pe;

	// 1. constructor(?????? ?̿?)
	public ScoreImpl() {
		this("",0,0,0);
	}

	public ScoreImpl(String name, int music, int art, int pe) {
		super();
		this.name = name;
		this.music = music;
		this.art = art;
		this.pe = pe;
	}

	// 2.setter method


	// ????ó?? ?̸?, ????, ?̼?, ü?? , ????, ????
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("?̸? : ");
		setName(sc.next());
		System.out.println("???? : ");
		setMusic(sc.nextInt());
		System.out.println("?̼? : ");
		setArt(sc.nextInt());
		System.out.println("ü?? : ");
		setPe(sc.nextInt());
	}


	@Override
	public int total() {
		return this.art + this.music + this.pe;
	}

	@Override
	public double avg() {
		return total()/3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMusic() {
		return music;
	}

	public void setMusic(int music) {
		this.music = music;
	}

	public int getArt() {
		return art;
	}

	public void setArt(int art) {
		this.art = art;
	}

	public int getPe() {
		return pe;
	}

	public void setPe(int pe) {
		this.pe = pe;
	}


}
