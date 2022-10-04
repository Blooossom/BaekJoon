package bronze.bronze5;
import java.io.*;
public class Test24082 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int X = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        sb.append((int)Math.pow(X,3));
        System.out.println(sb);

    }
}
