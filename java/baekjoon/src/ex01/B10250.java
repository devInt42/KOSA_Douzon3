package ex01;
import java.util.Scanner;
//22년 08월 01일
//더존비즈온 3기 류정수
//백준 2920번
public class B10250 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T>0){
            int cnt=0;
            int res=0;
            int H = sc.nextInt();   //층수
            int W = sc.nextInt();   //방번호수
            int N = sc.nextInt();   // 들어온순서
            int arr[][] = new int[W][H];
            for(int i=0; i<arr.length;i++){
                for(int j=0; j<arr[i].length;j++){
                    cnt++;
                    if(cnt==N){
                        res= (j+1)*100+(i+1);
                    }
                }
            }
            System.out.println(res);
            T--;
        }

    }
}

