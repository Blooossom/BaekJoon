package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test1009_분산처리 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       StringTokenizer st;
       int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            if (a % 10 == 0) {
                sb.append(10)
                        .append('\n');
                continue;
            }
            int num = a % 10;
            for (int j = 1; j < b; j++) {
                num = (num * a) % 10;
            }
            sb.append(num)
                    .append('\n');
        }
        System.out.print(sb);
    }
}
