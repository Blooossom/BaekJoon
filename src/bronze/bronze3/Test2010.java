package bronze.bronze3;
import java.io.*;
public class Test2010 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i <N; i++) {
            int plug = Integer.parseInt(br.readLine());
            sum +=plug;
        }
        System.out.println(sum-(N-1));
    }
}
