package ex01;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        int min = 0;


        for (int i = M; i <= N; i++) {
            if (i == 2) {// 2는 짝수중 유일한 소수이기 때문에
                sum += 2;
                min =2;
            }
            if (i % 2 == 1 && i > 1) {  // 1보다 큰 홀수일경우
                int res = PrimeNum(i);
                if (res != 0 && sum == 0) {
                    min = PrimeNum(i);
                }
                sum += PrimeNum(i);

            }

        }
        if (sum == 0) {
            sum = -1;
            System.out.println(sum);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }
    }

    static int PrimeNum(int i) {    //소수 구하기
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                i = 0;
                break;
            }
        }
        return i;
    }
}