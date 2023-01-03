package silver.silver1;

import java.io.*;
import java.util.StringTokenizer;

public class Test11660_구간합구하기5 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] prefixSum = new int[N + 1][N + 1];
        for (int i = 1; i < prefixSum.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 1; j < prefixSum[0].length; j++) {
                int p = Integer.parseInt(st.nextToken());
                prefixSum[i][j] = prefixSum[i][j - 1] + p;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < M; i++) {
            int result = 0;
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            for (int j = x1; j <= x2; j++) {
                result += prefixSum[j][y2] - prefixSum[j][y1 - 1];
            }
            sb.append(result).append('\n');
        }
        System.out.println(sb);
    }
}
