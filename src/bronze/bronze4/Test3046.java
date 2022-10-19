package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test3046 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int r1 = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        br.close();
        sb.append(2*s-r1);
        System.out.print(sb);
    }
}
