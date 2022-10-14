package ex06.api;

class Rectangle{
	int x, y;
	public void display() {
		System.out.println(x + ", " + y);
	}
	@Override
	public String toString() {
		String str = x + ", " +y;
		return str;
	}
	
}


public class ToStringMain {
public static void main(String[] args) {
	Rectangle r = new Rectangle();
	System.out.println(r);
	
}
}
