package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test13241 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        System.out.println(lcm(A,B));
    }
    public static int gcd(int p, int q){
        if (q == 0) {
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    public static long lcm(long a, long b){
        return (long)a *b/gcd((int) a, (int) b);
    }
}
