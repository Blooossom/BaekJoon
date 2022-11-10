package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test14490 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),":");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(A/gcd(A,B)).append(":").append(B/gcd(A,B));
        System.out.println(sb);
    }
    public static int gcd(int p, int q){
        if(q==0){
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
}
