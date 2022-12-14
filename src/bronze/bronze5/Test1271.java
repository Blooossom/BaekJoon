package bronze.bronze5;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test1271 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger M = new BigInteger(st.nextToken());
        BigInteger N = new BigInteger(st.nextToken());

        System.out.println(M.divide(N));
        System.out.println(M.remainder(N));

    }
}
