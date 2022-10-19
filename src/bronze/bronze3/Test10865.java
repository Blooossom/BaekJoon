package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test10865 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] friendship = new int[N];
        for (int i = 0; i <M; i++) {
            st=new StringTokenizer(br.readLine());
            for (int j = 0; j < 2; j++) {
                friendship[Integer.parseInt(st.nextToken())-1]++;
            }
        }
        for (int i = 0; i <friendship.length; i++) {
            System.out.println(friendship[i]);
        }
    }
}
