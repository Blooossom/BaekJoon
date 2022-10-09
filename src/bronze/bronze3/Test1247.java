package bronze.bronze3;
import java.io.*;
import java.math.BigInteger;
public class Test1247 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i <3; i++) {
            int N = Integer.parseInt(br.readLine());
            double sum = 0;
            for (int j = 0; j<N; j++) {
                sum += (double)Long.parseLong(br.readLine());
            }
            if(sum>0){
                System.out.println(("+"));
            }else if(sum<0){
                System.out.println("-");
            }else System.out.println(0);
        }
    }
}
