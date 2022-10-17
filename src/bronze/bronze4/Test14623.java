package bronze.bronze4;
import java.io.*;
public class Test14623 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        long a = 0;
        long b = 0;
        for (int i = 0; i <A.length(); i++) {
            if(A.charAt(i)=='1'){
                a += (long)Math.pow(2,A.length()-i-1);
            }else if(A.charAt(i)=='0'){
                a += 0;
            }
        }
        for (int i = 0; i <B.length(); i++) {
            if(B.charAt(i)=='1'){
                b += (long)Math.pow(2,B.length()-i-1);
            }else if(B.charAt(i)=='0'){
                b += 0;
            }
        }
        long result = a*b;
        System.out.println(Long.toBinaryString(result));
    }
}
