package bronze.bronze3;
import java.io.*;
public class Test2921 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int point=0;
        for (int i = 0; i <=N; i++) {
            for (int j = i; j <=N; j++) {
                point+=(i+j);
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(point);
        System.out.println(sb);
    }
}
