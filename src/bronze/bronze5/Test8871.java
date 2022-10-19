package bronze.bronze5;
import java.io.*;
public class Test8871 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append((N+1)*2).append("\s").append((N+1)*3);
        System.out.print(sb);
        br.close();
    }
}
