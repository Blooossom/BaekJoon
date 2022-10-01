import java.math.BigInteger;
import java.io.*;
public class Test2338{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        BigInteger B = new BigInteger(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(A.add(B)).append("\n")
                .append(A.subtract(B)).append("\n")
                .append(A.multiply(B));
        System.out.println(sb);

    }
}
