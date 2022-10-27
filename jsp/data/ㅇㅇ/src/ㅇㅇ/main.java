package ㅇㅇ;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class main {

   public static void main(String[] args) throws IOException {

      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      String str = br.readLine(); // XXXXXX

      StringTokenizer st1 = new StringTokenizer(str, "X"); //
      StringTokenizer st2 = new StringTokenizer(str, "."); // XXXXXX

      StringBuilder sb = new StringBuilder(); // string 합쳐주는 함수
      	if(str.charAt(0)=='.') {
      		sb.append(st1);
      	}
      while (true) {
    	  
    	  if(st2.hasMoreElements()) {
    		  if(st2.hasMoreTokens().) {
    			  
    		  }
    	  }
      }//END WHILE
   }
}