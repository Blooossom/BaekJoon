package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;
public class Test9325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i <T; i++) {
            int s = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            for (int j = 0; j <n; j++) {
                st=new StringTokenizer(br.readLine());
                int p = Integer.parseInt(st.nextToken());
                int q = Integer.parseInt(st.nextToken());
                sum += p*q;
            }
            System.out.println(s+sum);
        }
    }
}
