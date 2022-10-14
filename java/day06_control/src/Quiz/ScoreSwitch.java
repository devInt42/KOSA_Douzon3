package Quiz;

import java.util.Scanner;

public class ScoreSwitch {
   public static void main(String[] args) {

      // 점수 0~100점까지만 입력받게 처리
      try {
      char answer = 'y';
      while (answer == 'y') {
         Scanner sc = new Scanner(System.in);

         System.out.println("----------------성적표 입력 시스템 가동---------------");
         System.out.println("이름을 입력해주세요.");
         String name = sc.nextLine();

         // 국어점수 입력
         System.out.println("국어 점수 입력해주세요.");
         int kor = sc.nextInt();
         while (kor > 100 || kor < 0) {
            System.out.println("국어 점수 다시 입력해주세요.");
            kor = sc.nextInt();
         }

         // 영어점수 입력
         System.out.println("영어 점수 입력해주세요.");
         int eng = sc.nextInt();
         while (eng > 100 || eng < 0) {
            System.out.println("영어 점수 다시 입력해주세요.");
            kor = sc.nextInt();
         }

         // 전산점수 입력
         System.out.println("전산 점수 입력해주세요.");
         int com = sc.nextInt();
         while (com > 100 || com < 0) {
            System.out.println("전산 점수 다시 입력해주세요.");
            kor = sc.nextInt();
         }

         // 평균계산
         double avg = (double) (kor + eng + com) / 3.0;
         char grade = ' ';
         switch ((kor + eng + com) / 3 / 10) {
         case 10:
            grade = 'A';
            break;
         case 9:
            grade = 'A';
            break;
         case 8:
            grade = 'B';
            break;

         case 7:
            grade = 'C';
            break;
         case 6:
            grade = 'D';
            break;
         default:
            grade = 'F';

         }

         // 성적표 출력
         System.out.println("***** " + name + "의 성적표 *****");
         System.out.println("국어 : " + kor + ", 영어 : " + eng + ",  전산 : " + com);
         System.out.println("총점 : " + (kor + eng + com) + ", 평균 : " + String.format("%.2f", avg));
         System.out.println("학점 : " + grade);

         // 더 입력하도록 하는 반복문
         System.out.println("성적표를 더 입력하고 싶으시면 y를, 종료하시려면 n을 눌러주세요.");
         do {
            answer = sc.next().charAt(0);
            if (answer == 'n' || answer == 'N') {
               System.out.println("종료하겠습니다.");
               break;
            } else if (answer == 'y') {
               System.out.println("");
               System.out.println("새로운 학생의 성적표를 입력합니다..");
               System.out.println("");
               break;
            }
            System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
         } while (answer != 'y' || answer != 'Y');
      }

      // String grade = null;
      /*
       * if ((kor + eng + com) / 3 > 90) grade = 'A'; else if ((kor + eng + com) / 3 >
       * 80) grade = 'B'; else if ((kor + eng + com) / 3 > 70) grade = 'C'; else if
       * ((kor + eng + com) / 3 > 60) grade = 'D'; else grade = 'F';
       */
   
      }
      catch(Exception e) {
         System.out.println("잘못 입력하셨습니다.");
      }
   }
}