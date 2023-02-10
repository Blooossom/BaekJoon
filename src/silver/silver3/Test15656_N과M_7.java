package silver.silver3;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test15656_N과M_7 {
    public static int N, M, arr[], back[];
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
            back[depth] = arr[i];
            dfs(depth + 1);
        }
    }
}
