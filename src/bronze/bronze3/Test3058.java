package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test3058 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            int min = 100;
            for (int j = 0; j < 7; j++) {
                int N = Integer.parseInt(st.nextToken());
                if(N%2==0){
                    sum+=N;
                    if(min>N){
                        min=N;
                    }
                }
            }
            System.out.println(sum +min);
        }
    }
}
