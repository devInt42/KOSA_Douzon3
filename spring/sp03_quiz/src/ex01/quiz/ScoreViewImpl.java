package ex01.quiz;

import java.util.Scanner;

public class ScoreViewImpl implements IScoreView {
	private ScoreImpl score;
	
	// setter?? ????
	
	public void setScore(ScoreImpl score) {//DI????
		this.score = score;
	}
	
	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("?̸? : ");		score.setName(sc.next());
		System.out.print("???? : ");		score.setMusic(sc.nextInt());
		System.out.print("?̼? : ");		score.setArt(sc.nextInt());
		System.out.print("ü?? : ");		score.setPe(sc.nextInt());
	}

	@Override
	public void print() {
		System.out.println("?̸? : " + score.getName());
		System.out.println("???? :" + score.total());
		System.out.println("???? :" + score.avg());

	}

}
