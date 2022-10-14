package ex02.Interface;

public class MainEntry {
	public static void main(String[] args) {
		BB b = new BB();
		b.draw();
		b.show();
		
		IDraw bb = new BB();
		bb.draw();
	}
}
