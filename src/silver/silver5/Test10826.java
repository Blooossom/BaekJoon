package silver.silver5;

import java.io.*;
import java.math.BigInteger;
import java.util.ArrayList;

public class Test10826 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        System.out.println(fibonacci(input));
    }
    public static BigInteger fibonacci(int n){
        ArrayList<BigInteger> list = new ArrayList<>();
        list.add(new BigInteger("0"));
        list.add(new BigInteger("1"));
        for (int i = 2; i <n+1; i++) {
            list.add(list.get(i-2).add(list.get(i-1)));
        }
        return list.get(n);
    }
}
