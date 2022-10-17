package bronze.bronze2;
import java.io.*;
import java.math.BigInteger;

public class Test1212 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        BigInteger input = new BigInteger(str,8);
        String answer = input.toString(2);
        System.out.println(answer);
    }
}
