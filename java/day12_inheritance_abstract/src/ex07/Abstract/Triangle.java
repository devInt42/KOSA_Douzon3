package ex07.Abstract;

public class Triangle extends Shape {
	int h=10, w=6;
	@Override
	public double calc() {
		result = (h * w)/2;
		return result;
	}

	@Override
	public void draw() {
		calc();
		System.out.println("삼각형의 넓이 : " + result + "인 사각형을 그렸습니다.");
	}

}
