package ex01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//22년 08월 24일
//더존비즈온 3기 류정수
//백준 1193번
public class B2869 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int res = (V - B) / (A - B);
        if ((V - B) % (A - B) != 0){
            res++;
        }

        System.out.println(res);

    }
}


