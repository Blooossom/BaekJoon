import java.io.*;
import java.util.StringTokenizer;

public class Test10813_공바꾸기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sp = Integer.parseInt(st.nextToken());
            int ep = Integer.parseInt(st.nextToken());
            int temp = arr[sp - 1];
            arr[sp - 1] = arr[ep - 1];
            arr[ep - 1] = temp;
        }
        StringBuilder sb = new StringBuilder();
        for (int param:arr) {
            sb.append(param).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
