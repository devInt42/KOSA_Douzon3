package ex07.Abstract;

public abstract class Shape {
	double result =0;
	public abstract double calc();
	public abstract void draw();
	
	public void show() {
		System.out.println("Super class Shape");
	}
}
