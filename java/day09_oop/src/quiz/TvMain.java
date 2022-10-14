package quiz;

import java.util.Scanner;

class Tv {
	private String color;
	private int channel;

	public String getColor() {

		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("TV 채널을 입력하세요");
		setChannel(sc.nextInt());
		System.out.println("색을 입력하세요");
		setColor(sc.next());
		System.out.println("현재 채널 : " + getChannel() + "\t 현재 색 : "+ getColor());

	}

}

public class TvMain {
	public static void main(String[] args) {

		Tv t = new Tv();
		t.input();
	}
}
