package bronze.bronze3;
import java.io.*;
public class Test13752 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            System.out.println("=".repeat(Integer.parseInt(br.readLine())));
        }
    }
}
