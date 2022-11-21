package AlgorithmSrc;
import java.io.*;
public class DP_fibonacci_self {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        //n번째 피보나치 수를 구하고 출력하라
        System.out.println(fibonacci(N));
        br.close();
    }
    private static long fibonacci(int n){
        if(n==1||n==2){
            return 1;
        }
        //점화식
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
