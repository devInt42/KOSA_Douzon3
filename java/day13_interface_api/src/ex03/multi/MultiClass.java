package ex03.multi;

import ex02.Interface.IDraw;
import ex08.Abstract.Shape;

public class MultiClass extends Shape implements IDraw, Test {
	
	@Override
	public void draw() {
		System.out.println("IDraw interface method");
	}

	@Override
	public double calc(double x) {
		System.out.println("shape abstract class method");
		return x;
	}

	@Override
	public void tshow(String name) {
		calc(5.5);
		System.out.println("Test interface method");
	}

	@Override
	public void show(String name) {
		System.out.println("shape abstract class method");
		System.out.println(name + "hi!!!!!!!");
	}

}
