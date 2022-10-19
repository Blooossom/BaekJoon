package bronze.bronze5;
import java.io.*;
import java.math.BigInteger;
public class Test88652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BigInteger a = new BigInteger(br.readLine());
        BigInteger b = new BigInteger(br.readLine());
        BigInteger c = new BigInteger(br.readLine());
        System.out.println(b.subtract(c).divide(a));

    }
}
