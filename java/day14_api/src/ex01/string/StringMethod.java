package ex01.string;

public class StringMethod {
   public static void main(String[] args) {
      String s1 = "happydoyeon" ;
      String s2 = "SEOUL";

      System.out.println("s1 = "+s1+", s2 = "+ s2);
      System.out.println(s1.concat(s2)); // 문자열 결합
      System.out.println(s1+s2);
      System.out.println(s2.replace("EO", "korea"));
      System.out.println("s1 = "+s1+", s2 = "+ s2);
//      s2 = s2.replace("EO", "korea");
      
      String s3 = new String("     ab     cd     ");
      System.out.println("length = " + s3.length());
      s3 = s3.trim();
      System.out.println("length = " + s3.length());
      System.out.println(s3);
      
      int[] arr = { 1,2,3,4,5};
      for (int i = 0; i< arr.length; i++) {
         
      }
      
      String s4 = new String("abd defgh k2344 keijk 439583958");
      String[] s5 = s4.split(" ");
      for(int i = 0 ; i < s5.length; i++) {
    	  System.out.println("분리된 " + i + "번째 문자열 : " + s5[i]);
      }
      System.out.println("소문자 출력 toLowerCase() : " +s2.toLowerCase());
      System.out.println("데문자 출력 toUpperCase() : " +s1.toUpperCase());

   }
}