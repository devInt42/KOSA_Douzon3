package ex03.quiz;

public class FootballViewImpl implements IPlayer {
	private String name, position, category;
	@Override
	public void print() {
		System.out.println("====== setter method =====\n");
		System.out.println("����� : " + category );
		System.out.println("������ : " + name );
		System.out.println("������ : " + position +"\n");

	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}