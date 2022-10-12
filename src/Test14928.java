import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Test14928 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());

        BigInteger N = new BigInteger(st.nextToken());
        BigInteger A = new BigInteger("20000303");
        StringBuilder sb = new StringBuilder();
        sb.append(N.remainder(A));
        System.out.print(sb);
    }

}
