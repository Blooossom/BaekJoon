package bronze.bronze5;
import java.io.*;
public class Test24086 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append(B-A);
        System.out.println(sb);

    }
}
