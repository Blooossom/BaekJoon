package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Teset9550 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            st=new StringTokenizer(br.readLine());
            int count = 0;
            for (int j = 0; j <N; j++) {
                arr[j]= Integer.parseInt(st.nextToken());
                count += arr[j]/K;
            }
            System.out.println(count);
        }
    }
}
