package bronze.bronze1;

import java.io.*;
import java.math.BigInteger;

public class Test4150 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        BigInteger A = new BigInteger("0");
        BigInteger B = new BigInteger("1");
        BigInteger sum=new BigInteger("0");
        if (input==1){
            System.out.println(1);
        }else {
            for (int i = 0; i < input - 1; i++) {
                sum = A.add(B);
                A = B;
                B = sum;
            }
            System.out.println(sum);
        }
    }
}
