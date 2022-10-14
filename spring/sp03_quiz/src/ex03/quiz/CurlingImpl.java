package ex03.quiz;

public class CurlingImpl implements IPlayer {
	private String name, position, category;
	// 1. constructor(������ �̿�)
	public CurlingImpl() {
		this("","","");
	}
	
	public CurlingImpl(String name, String position, String category) {
		super();
		this.name = name;
		this.position = position;
		this.category = category;
	}
	
	@Override
	public void print() {
		System.out.println("====== constructor ======\n");
		System.out.println("����� : " + category );
		System.out.println("������ : " + name );
		System.out.println("������ : " + position);
		System.out.println("����~~~ ����~~ �����ƴϾ�~~");
		}
	
	
	
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
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}