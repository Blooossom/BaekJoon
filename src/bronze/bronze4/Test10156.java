package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test10156 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        if(K*N-M<=0){
            sb.append(0);
        }else sb.append(K*N-M);

        System.out.println(sb);
    }
}
