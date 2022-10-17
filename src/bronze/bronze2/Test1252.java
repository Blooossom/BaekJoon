package bronze.bronze2;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Test1252 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String A = st.nextToken();
        String B = st.nextToken();
        BigInteger a = new BigInteger(A,2);
        BigInteger b = new BigInteger(B, 2);
        BigInteger result = a.add(b);

        String answer = result.toString(2);
        System.out.println(answer);

    }
}
/*
double a = 0;
        double b = 0;
        for (int i = 0; i < A.length(); i++) {
            if(A.charAt(i)=='1'){
                a += Math.pow(2,A.length()-1);
            }
        }
        System.out.println(a);
        for (int i = 0; i <B.length(); i++) {
            if(B.charAt(i)=='1'){
                b += Math.pow(2,B.length()-1);
            }
        }
        System.out.println(b);
        double sum = a+b;
        System.out.println(sum);
        String answer = "";
 */
