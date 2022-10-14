package ex04.constructor;

class Point{
   private int x, y;
   
   public Point() { // 디폴트 생성자 함수
      x = y = 100;
   }
   public Point(int x) { // 매개변수 1개 생성자 함수
      this.x = x;
      y = 88;
   }
   public Point(int x, int y) { //매개 변수 2개 생성자 함수
      this.x = x;
      this.y = y;
      x = y = 100;
   }
   public int getX() {
      return x;
   }
   public void setX(int x) {
      this.x = x;
   }
   public int getY() {
      return y;
   }
   public void setY(int y) {
      this.y = y;
   }
   
   public void disp() {
      System.out.println(x+", "+y);
   }
}

public class MainEntry {
   public static void main(String[] args) {
      Point pt = new Point();
      Point pt2 = new Point(20, 30);
      Point pt3 = new Point(555);
      
      pt2.setX(50);
      pt3.disp();
      pt2.disp();
      pt.disp();
   }
}