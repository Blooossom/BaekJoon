package silver.silver1;

import java.io.*;
import java.util.StringTokenizer;

public class Test1629 {
    public static long C;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        C = Long.parseLong(st.nextToken());
        System.out.println(pow(A,B));

    }
    public static long pow(long A, long exponent){
        //지수가 1일 경우 A^1이므로 A를 그대로 리턴
        if(exponent==1){
            return A%C;
        }

        //지수의 절반에 해당하는 A^(exponent/2)를 구함
        long temp = pow(A,exponent/2);
        /*
        현재 지수가 홀수였다면
        A^(exponent/2)*A^(exponent/2)*A이므로
        A를 한번 더 곱해줘야함
        ex) A^9 = A^4*A^4*A
         */
        if(exponent%2==1){
            return (temp*temp%C)*A%C;
        }
        //그 외에는 짝수이므로 구했던 값을 한번 더 곱해서 반환
        return temp*temp%C;
    }
}
