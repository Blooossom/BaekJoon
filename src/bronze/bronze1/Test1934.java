package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test1934 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            System.out.println(lcm(a,b));
        }
    }
    public static int gcd(int p, int q){
        if(q==0){
            return p;
        }else{
            return gcd(q, p%q);
        }
    }
    public static int lcm(int p, int q){
        return p*q/gcd(p,q);
    }
}
