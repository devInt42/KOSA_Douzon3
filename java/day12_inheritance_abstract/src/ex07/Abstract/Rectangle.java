package ex07.Abstract;

public class Rectangle extends Shape {
	int h = 10, w = 20;

	@Override
	public double calc() {
		result = h * w;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("사각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
	}

}
