import java.math.BigInteger;
import java.io.*;
import java.util.StringTokenizer;

public class Test13277 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append(A.multiply(B));
        System.out.println(sb);

    }
}
