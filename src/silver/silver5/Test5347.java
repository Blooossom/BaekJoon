package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;
public class Test5347 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            BigInteger A = new BigInteger(st.nextToken());
            BigInteger B = new BigInteger(st.nextToken());
            System.out.println(lcm(A,B));
        }

    }
    public static BigInteger gcd(BigInteger p, BigInteger q){
        if(q.toString().equals("0")){
            return p;
        }else{
            return gcd(q,p.remainder(q));
        }
    }
    public static BigInteger lcm(BigInteger p, BigInteger q){
        return p.multiply(q).divide(gcd(p,q));
    }
}
