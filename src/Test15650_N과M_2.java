import java.io.*;
import java.util.StringTokenizer;

public class Test15650_N과M_2 {
    public static int N, M;
    public static int[] arr;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[M];

        dfs(1, 0);

        System.out.println(sb);
    }
    public static void dfs(int sp, int depth) {
        if (depth == M) {
            for (int val:arr) {
                sb.append(val)
                        .append(' ');
            }
            sb.append('\n');
            return;
        }

        for (int i = sp; i <= N; i++) {
           arr[depth] = i;
           dfs(i + 1, depth + 1);
        }
    }
}
