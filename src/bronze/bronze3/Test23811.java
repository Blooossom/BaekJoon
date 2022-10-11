package bronze.bronze3;
import java.io.*;
public class Test23811 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str1 = ("@".repeat(5*N)+"\n").repeat(N);
        String str2 = ("@".repeat(N)+"\n").repeat(N);
        StringBuilder sb = new StringBuilder();
        sb.append(str1).append(str2).append(str1).append(str2).append(str1);

        System.out.print(sb);
    }
}
