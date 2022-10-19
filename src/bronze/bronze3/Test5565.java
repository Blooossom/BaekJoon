package bronze.bronze3;
import java.io.*;
public class Test5565 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int P = Integer.parseInt(br.readLine());

        for (int i = 0; i <9; i++) {
            P = P- Integer.parseInt(br.readLine());
        }
        System.out.print(P);
    }
}
