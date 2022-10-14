package ex02.oop;

public class Point {
   private int x, y; // private <default <protected < public

   public Point() {
      x = 9; y = 8;
   }
   public void setData(int xx, int yy) {
      x=xx;
      y=yy;
   }
   
   public int getY() {
      return y;
   }

   public void setY(int y) {
      this.y = y;
   }

   public int getX() {
      return x;
   }

   public void setX(int xx) {
      x = xx;
   }
   public void display() {
      System.out.println(x+","+y);
   }
}