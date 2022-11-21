package bronze.bronze1;

import java.io.*;
import java.math.BigInteger;
public class Test2748 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N>=2){
            System.out.println(fibonacci(N));
        }else{
            System.out.println(N);
        }

    }
    public static BigInteger fibonacci(int n){
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger sum = new BigInteger("0");
        int count = 1;
        while(count!=n){
            sum = a.add(b);
            a=b;
            b=sum;
            count++;
        }
        return sum;
    }
}
