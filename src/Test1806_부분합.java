import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1806_부분합 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        int sp = 0;
        int ep = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int[] length = new int[N];
        int sum = 0;
        while (true) {
            if (sp >= arr.length || ep >= arr.length) {
                break;
            }
            sum += arr[ep];
            if (ep == arr.length - 1) {
                if (sum < S) {
                    length[sp] = arr.length + 1;
                    sp++;
                    ep = sp;
                    sum = 0;
                }
                else {
                    length[sp] = ep - sp + 1;
                    sp++;
                    ep = sp;
                    sum = 0;
                }

            }
            else{
                if (sum < S) {
                    ep++;
                }
                else {
                    length[sp] = ep - sp + 1;
                    sp++;
                    ep = sp;
                    sum = 0;
                }
            }
        }
        Arrays.sort(length);
        System.out.println(length[0]);

    }
}
