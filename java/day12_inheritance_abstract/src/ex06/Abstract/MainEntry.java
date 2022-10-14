package ex06.Abstract;

abstract class Shape{
	protected double result = 0;
	public abstract double calc(); // 추상 메소드 - 몸체가 없다
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}//Shape end

class Circle extends Shape{

	@Override
	public double calc() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		
	}
	
}// Circle end

public class MainEntry {
	public static void main(String[] args) {
//		Shape s = new Shape(); //추상 클래스는 객체 생성이 불가능
		Shape s = new Circle();	//자손을 통해 객체 생성가능
		
	}
}
