package bronze.bronze3;
import java.io.*;

public class Test4458 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N  = Integer.parseInt(br.readLine());

        for (int i = 0; i <N; i++) {
            StringBuilder sb = new StringBuilder();
            String str =br.readLine();
            String answer = str.substring(0,1).toUpperCase();
            sb.append(answer).append(str.substring(1)).append("\n");
            System.out.print(sb);
        }
    }
}
