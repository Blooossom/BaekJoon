package bronze.bronze2;
import java.io.*;
import java.math.BigInteger;

public class Test1550 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger tmp = new BigInteger(str,16);
        System.out.print(tmp.toString(10));
    }
}
