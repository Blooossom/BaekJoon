import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test6159_코스튬_파티 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        int sp = 0;
        int ep = arr.length - 1;
        int count = 0;
        for (int i = sp; i < arr.length - 1; i++) {
            while (true) {
                if (ep == 1) {
                    break;
                }
                if (arr[i] + arr[ep] > S) {
                    ep--;
                }
                else {
                    count++;
                    ep--;
                }
            }
            ep = arr.length - 1;
        }
        System.out.println(count);

    }
}
