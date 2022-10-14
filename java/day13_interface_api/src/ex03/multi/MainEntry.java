package ex03.multi;

import ex02.Interface.IDraw;
import ex08.Abstract.Shape;

public class MainEntry {
	public static void main(String[] args) {
		MultiClass mc = new MultiClass();
		mc.draw();
		mc.tshow("류정수");
		mc.show("박태환");
		System.out.println("==================");
		IDraw i = new MultiClass();
		i.draw();
		System.out.println(i.su);
		System.out.println("==================");
		
		Shape s = new MultiClass();
		s.show("김연아");
		
	}
}
