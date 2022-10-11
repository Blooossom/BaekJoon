package bronze.bronze2;
import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Test1225 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger str = new BigInteger(st.nextToken());
        BigInteger str2 = new BigInteger(st.nextToken());

        String A = str.toString();
        String B = str2.toString();
        long total=0;
        for (int i = 0; i <A.length(); i++) {
            for (int j = 0; j <B.length(); j++) {
             total+= Integer.parseInt(A.substring(i,i+1))* Integer.parseInt(B.substring(j,j+1));
            }
        }
        System.out.print(total);
    }
}
