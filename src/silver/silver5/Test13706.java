package silver.silver5;

import java.io.*;
import java.math.BigInteger;

public class Test13706 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger N = new BigInteger(br.readLine());
        System.out.println(N.sqrt());
    }
}
