	package ex03.randomClass;
	
	import java.util.Random;
	
	/*
	 * 2) Random class - java.util package
	 */
	public class MainEntry {
		public static void main(String[] args) {
			Random  rand = new Random();  //객체생성, 메모리에 할당, 생성자함수 자동호출
			
			 System.out.println(rand.nextInt());  // nextInt()  int형 크기안에 있는 임의적인 숫자 추출
			 System.out.println(rand.nextDouble()); 
			 System.out.println(rand.nextBoolean()); 
			 
			 System.out.println(rand.nextInt(5));  // 0 ~ 4 
			 System.out.println(rand.nextInt(10) + 1);  // 1 ~ 10
			 
			 for (int i = 1; i <11; i++) {
				 System.out.print(rand.nextInt(10) + 1 + "  "); 
			}
		}
	}
