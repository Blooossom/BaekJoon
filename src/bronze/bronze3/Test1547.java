package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test1547 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr = {1,0,0};
        int tmp;
        for (int i = 0; i <M; i++) {
            st = new StringTokenizer(br.readLine());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            tmp = arr[X-1];
            arr[X-1]=arr[Y-1];
            arr[Y-1]=tmp;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]==1){
                sb.append(i+1);
            }
            System.out.print(sb);
        }
    }
}
