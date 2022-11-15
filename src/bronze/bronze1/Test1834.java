package bronze.bronze1;

import java.io.*;
import java.math.BigInteger;

public class Test1834 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        long m = 0;
        for (int i = 1; i <= N - 1; i++) {
            m += i;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(m*(N+1));
        System.out.println(sb);
    }
}
