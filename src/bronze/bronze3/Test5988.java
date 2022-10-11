package bronze.bronze3;
import java.io.*;
import java.math.BigInteger;
public class Test5988 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <N; i++) {
            BigInteger K = new BigInteger(br.readLine());
            String str = K.toString();
            if((Integer.parseInt(str.substring(str.length()-1)))%2==0){
                System.out.println("even");
            }else System.out.println("odd");
        }
    }
}
