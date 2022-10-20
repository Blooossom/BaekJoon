package bronze.bronze3;
import java.io.*;
public class Test5524 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i <N; i++) {
            String str = br.readLine();
            System.out.println(str.toLowerCase());
        }
    }
}
