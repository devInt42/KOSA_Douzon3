package quiz;

import java.util.Random;
import java.util.Scanner;

public class randomGame {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner sc = new Scanner(System.in);
		int randNum = rand.nextInt((100) + 1);	//랜덤 수 생성
		int chance = 1;	//기회변수
		while (chance < 6) {
			System.out.print(chance + "번째 기회 : ");
			int inputNum = sc.nextInt();	//값 입력
			if (inputNum == randNum) {	//정답일경우
				System.out.println("정답입니다! 럭키가이~");
				break;
			} else {	// 오답일경우
				System.out.print("까비 아깝소");
				if(inputNum > randNum) System.out.println("\t 힌트 : DOWN~");
				else System.out.println("\t 힌트 : UP~");
				
				
				chance++;
				if (chance > 5) {	//5번 기회를 다 소진한 경우
					System.out.println("\n정답은!!!!??");
					System.out.println(randNum);
				}
			}
		}

	}
}
