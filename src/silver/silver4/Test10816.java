package silver.silver4;
import java.io.*;
import java.util.StringTokenizer;
public class Test10816 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[20000001];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<M; i++){
            arr[Integer.parseInt(st.nextToken())+10000000]++;
        }
        int N =Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++){
            sb.append(arr[Integer.parseInt(st.nextToken())+10000000]).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}
