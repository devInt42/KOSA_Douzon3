package ex07.Abstract;

public class MainEntry {
	public static void main(String[] args) {
		// 1. 각자의 클래스로 객체 생성한 형태
		Circle c = new Circle();
		c.draw();
		Rectangle r = new Rectangle();
		r.draw();
		Triangle t = new Triangle();
		t.draw();
	}
}
