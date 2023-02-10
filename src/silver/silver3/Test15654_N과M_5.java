package silver.silver3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15654_N과M_5 {
    public static int N, M, arr[], back[];
    public static boolean[] visit;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());

        arr = new int[N];
        back = new int[M];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        visit = new boolean[arr[arr.length - 1] + 1];
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
        for (int i = 0; i < arr.length; i++) {
            if (!visit[arr[i]]) {
                visit[arr[i]] = true;
                back[depth] = arr[i];
                dfs(depth + 1);
                visit[arr[i]] = false;
            }
        }
    }
}
