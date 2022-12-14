package ex03.quiz;

public class CurlingImpl implements IPlayer {
	private String name, position, category;
	// 1. constructor(생성자 이용)
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
		System.out.println("종목명 : " + category );
		System.out.println("선수명 : " + name );
		System.out.println("포지션 : " + position);
		System.out.println("영미~~~ 영미~~ 아직아니야~~");
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
