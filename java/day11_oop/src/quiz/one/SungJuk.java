package quiz.one;

import java.util.Scanner;

public class SungJuk {
	
	public static void input() {
		int kor, com, eng;
		int[] arr = new int[3]; //
		
		String[] subject = { "국어" , "영어", "전산" };
		Scanner sc=new Scanner(System.in);
	
		for (int i = 0; i < arr.length; i++) {
			System.out.print(subject[i] + "성적을 입력하시오: ");
			arr[i] = sc.nextInt();		
		}
		
		process(arr[0], arr[1], arr[2]);  // 함수호출
	}
	/*public static int[] su(){
		int kor,com,eng;
		int[] a=new int[3]; //
		String[] subject = { "국어" , "영어", "전산" };
		Scanner sc=new Scanner(System.in);
	
		for (int i = 0; i < a.length; i++) {
			System.out.print(subject[i] + "성적을 입력하시오: ");
			a[i] = sc.nextInt();				
		}
		//sc.skip("\\r\\n");
		return a;
		
	}*/
	
	public static void process(int kor, int com, int eng){
		int sum=kor + com + eng ;
		double avg=sum/3.0 ;  //  avg = (double)sum / arr.lenght;
		char grade;
		
		switch ((int)avg / 10)	{
			case 10:
			case 9: grade ='A';break;
			case 8: grade ='B';break;
			case 7: grade ='C';break;
			case 6: grade ='D';break;
			default : grade = 'F';
		
		}//end switch
			
		System.out.println("\nkor : " + kor + "\teng : " + eng + "\tcom : " + com);
		System.out.println("총점 : " + sum + "평균 : "+Math.round(avg * 100)/100.00 +"점으로  "+grade+" 학점입니다.");
			
	}	
}
