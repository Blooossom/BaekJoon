package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test9085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb;
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            int N = Integer.parseInt(br.readLine());
            int sum =0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j <N; j++) {
                sum += Integer.parseInt(st.nextToken());
            }
            sb = new StringBuilder();
            sb.append(sum);
            System.out.println(sb);
        }
    }
}
