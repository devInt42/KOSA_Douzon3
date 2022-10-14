package quiz;

import java.util.Arrays;
import java.util.Random;

public class LottoMain {


	public static void randNum(int[] x) {	//로또 번호 생성
		Random rand = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = rand.nextInt(45) + 1;
		}
		System.out.println(Arrays.toString(x));
	}//end rand Num
	
	public static void checkNum(int[] x) {	//중복확인
		Random rand = new Random();
		while(true) {
			for(int i = 0; i<x.length;i++) {
				for(int j=i+1; j<x.length;j++) {
					if(x[i]==x[j]) {
						x[j]= rand.nextInt(45)+1;	//중복 발생의 경우 x[j]수를 다시 새로운 수로 생성
						i=0;	//i를 0으로 초기화해주어 바뀐 x[j]로 적용하여 처음부터 재검사
					}
				}
			}
			break;
		}
		
	}//end checkNum
	public static void output(int[] x) {
		checkNum(x);
		System.out.print("로또 번호는 : ");
		for (int i = 0; i < x.length; i++) {
			System.out.print("\t" + x[i]);
		}
		System.out.print("\t입니다.");
	}//end output
	
	
	public static void main(String[] args) {
		int[] Lotto = new int[6];
		randNum(Lotto);	//6개의 랜덤 수 생성
		output(Lotto);
		
	}
}
