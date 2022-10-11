package bronze.bronze3;
import java.io.*;
public class Test11966 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long N = Long.parseLong(br.readLine());
        int count = 0;
        for (int i = 0; i <31; i++) {
            if(N==(long)Math.pow(2,i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
