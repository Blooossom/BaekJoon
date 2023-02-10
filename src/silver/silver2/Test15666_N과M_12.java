package silver.silver2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15666_N과M_12 {
    public static int N, M, arr[], result[];
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        arr = new int[N];
        result = new int[M];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        dfs(0, 0);
        System.out.println(sb);
    }
    public static void dfs(int sp, int depth) {
        if (depth == M) {
            for (int val:result) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        int past = -1;
        for (int i = sp; i < N; i++) {
            int now = arr[i];
            if (past == now) {
                continue;
            }
            else {
                past = now;
                result[depth] = arr[i];
                dfs(i, depth + 1);
            }
        }
    }
}
