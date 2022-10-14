package quiz;

//문제] 성적처리 프로그램 만들기
public class QuizScore {

	public static void main(String[] args) {
		int kor = 90, eng = 88, com = 100;
		int total;
		double avg = 0;
		int tot = 0;
		tot = kor+eng+com;
		avg = tot/3.0;
		
		String name = "Integer";
		System.out.printf("***********%s님의 성적표***********\n", name);
		System.out.printf("국어 : %d, 영어 : %d, 전산 : %d\n", kor, eng, com);
		System.out.printf("총점 : %d \t평균 : %.2f", tot, avg);
		
		
	}

}
