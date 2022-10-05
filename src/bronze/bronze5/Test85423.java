package bronze.bronze5;
import java.io.*;
import java.math.BigInteger;
public class Test85423 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger N = new BigInteger(br.readLine());
        BigInteger input = new BigInteger(br.readLine());

        System.out.println((N.add(input)).divide(BigInteger.TWO));
        System.out.println(N.add(input).divide(BigInteger.TWO).subtract(input));
    }
}
