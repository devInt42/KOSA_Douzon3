package ex01;

import java.util.Scanner;

public class B1110 {
	public static void main(String[] args) {

		int x, cnt = 0; // cnt 사이클길이 저장할 변수
		int y = new Scanner(System.in).nextInt();	//y값을 scanner를 통해 입력받음
		x=y;	//y값이 while문에 들어가서 계속 변경되기때문에 x값에 초기값을 저장
		while (true) {
			y = (y%10)*10+((y/10)+(y%10))%10;	//조건
			cnt++;	// 사이클이 조건을 만족시키지 못할때마다 +1
			if(x==y)	
				break;
		}
		System.out.println(cnt);
	}
}
