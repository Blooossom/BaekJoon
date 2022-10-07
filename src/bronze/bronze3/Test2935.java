package bronze.bronze3;
import java.io.*;
import java.math.BigInteger;
public class Test2935 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BigInteger A = new BigInteger(br.readLine());
        String str = br.readLine();
        BigInteger B = new BigInteger(br.readLine());

        if(str.equals("+")){
            System.out.println(A.add(B));
        }else if(str.equals("*")){
            System.out.println(A.multiply(B));
        }
    }
}
