package Unsolved;
import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Test1009 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            BigInteger A = new BigInteger(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            BigInteger n = new BigInteger("1");
            for (int j = 0; j <b; j++) {
                n = n.multiply(A);
            }
            BigInteger R = new BigInteger("10");
            System.out.println(n.remainder(R));

        }
    }
}
