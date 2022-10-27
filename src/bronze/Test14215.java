package bronze;
import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;
public class Test14215 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        System.out.println(calc(a,b));
    }
    public static long calc(int a, int b){
        BigInteger sum=new BigInteger("0");
        int temp = 0;
        for (int i = 1; i <a+1; i++) {
            BigInteger tmp = new BigInteger(Integer.toString(i));
            sum=sum.add(tmp);
        }
        temp = Integer.parseInt(sum.toString());
        for (int i = a+1; i <b+1; i++) {
            temp = temp + i;
            BigInteger B = new BigInteger(Integer.toString(temp));
            sum=sum.multiply(B);
        }
        BigInteger re = new BigInteger("14579");
        return Integer.parseInt((sum.remainder(re).toString()));
    }
}
