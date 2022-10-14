package ex08.string;

public class Rect extends Shape {
   int h = 10;
   @Override
   public double calc(double x) {
      result = h * x;
      return result;
   }

   @Override
   public void show(String name) {
      calc(9.8);
      System.out.println(result + "크기의 "+ name+ "이 그려졌습니다");

   }
public void disp() {
	System.out.println("Rect sub class");
}

}