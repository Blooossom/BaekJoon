package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Test11945 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger a = new BigInteger(st.nextToken());
        //int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i <a.doubleValue(); i++) {
            StringBuilder sb=new StringBuilder(br.readLine());
            String reverse = sb.reverse().toString();
            System.out.println(reverse);
        }
    }
}
