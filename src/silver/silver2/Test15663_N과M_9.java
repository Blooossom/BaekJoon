package silver.silver2;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15663_N과M_9 {
    public static int N, M, arr[], back[];
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        back = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        visit = new boolean[N];
        dfs(0);
        System.out.println(sb);
    }
    public static void dfs(int depth) {
        if (depth == M) {
            for (int val:back) {
                sb.append(val).append(' ');
            }
            sb.append('\n');
            return;
        }
        int past = -1;
        for (int i = 0; i < N; i++) {
            int now = arr[i];
            if (visit[i] || past == now) {
                continue;
            }
            else {
                past = now;
                visit[i] = true;
                back[depth] = arr[i];
                dfs(depth + 1);
                visit[i] = false;
            }
        }
    }
}
