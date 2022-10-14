package ex02.collection.list;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx3 {
   public static void main(String[] args) {
      ArrayList list = new ArrayList(10);
      list.add(5);
      list.add(4);
      list.add(0);
      list.add(2);
      list.add(1);
      list.add(3);
      
      ArrayList list2 = new ArrayList(list.subList(1, 4));
      print(list, list2);
      
      Collections.sort(list);
      Collections.sort(list2);
      print(list, list2);
      System.out.println("list.containsAll(list2) : "+ list.containsAll(list2));
      list2.add("B");
      list2.add("C");
      print(list, list2);
      list2.add(3,"A");
      print(list, list2);

   }
   
   private static void print(ArrayList list, ArrayList list2) {
      System.out.println("list : "+ list);
      System.out.println("list2 : "+ list2);
      System.out.println();
   }
}