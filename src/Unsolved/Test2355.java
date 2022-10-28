package Unsolved;
import java.io.*;
import java.util.StringTokenizer;

public class Test2355 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.print(sigma(A,B));
    }
    public static long sigma(int X, int Y){
        long sum =0;
        for (int i = X; i <=Y; i++) {
            sum += i;
        }
        return sum;
    }
}
