import java.io.*;
import java.util.StringTokenizer;

public class Test2313 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[] arr;
        int[] prefixSum;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            st = new StringTokenizer(br.readLine());
            arr = new int[N];
            prefixSum = new int[N];
            int left = 0;
            int right = 0;
            int sum = 0;
            for (int j = 0; j < N; j++) {
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
            }
            prefixSum[0] = sum;
            for (int j = 0; j < arr.length; j++) {

            }

        }
    }
}
