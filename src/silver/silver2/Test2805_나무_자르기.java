package silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class Test2805_나무_자르기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[] tree = new int[N];
        int sp = 0, ep = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tree[i] = Integer.parseInt(st.nextToken());
            if (ep < tree[i]) {
                ep = tree[i];
            }
        }
        while(sp < ep){
            int mid = (sp + ep) / 2;
            long sum = 0;
            for (int height:tree){
                if (height - mid > 0) {
                    sum += (height - mid);
                }
            }
            if (sum < M) {
                ep = mid;
            }
            else {
                sp = mid + 1;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(sp - 1));
        bw.flush();
    }
}
