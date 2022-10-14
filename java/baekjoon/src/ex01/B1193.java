package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//22년 08월 26일
//더존비즈온 3기 류정수
//백준 1193번
public class B1193 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 입력값
        int cnt = 0; // 현재 행까지의 누적합
        int hang = 0;  // 행번호
        int top=0;  //분자
        int bot=0;  //분모

        while (true) {
            hang++;
            cnt += hang;
            if(cnt>=N){
                if(hang%2==1){  //홀수행
                    bot = hang - (cnt-N);
                    top = (hang+1)-bot;
                    break;
                } else if (hang%2==0) { //짝수행
                    top = hang - (cnt-N);
                    bot = (hang+1)-top;
                    break;
                }

            }
        }
        System.out.println(top+"/"+bot);
    }
}


