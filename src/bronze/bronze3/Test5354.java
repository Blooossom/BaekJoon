package bronze.bronze3;
import java.io.*;
public class Test5354 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(br.readLine());
            if(N==1){
                System.out.println("J");
                continue;
            }
            sb.append("#".repeat(N)+"\n")
                    .append(("#"+"J".repeat(N-2)+"#\n").repeat(N-2))
                    .append("#".repeat(N)+"\n\n");
            System.out.print(sb);
        }
    }
}
