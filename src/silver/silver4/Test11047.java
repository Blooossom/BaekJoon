package silver.silver4;

import java.io.*;
import java.util.StringTokenizer;

public class Test11047 {
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static StringTokenizer st;
    public static void main(String[] args) throws IOException{
        int N, K, arr[], count;

        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());

        System.out.println(Solution(N, K));
    }
    public static int Solution(int N, int K) throws IOException{
        int arr[], count;
        arr  = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        count = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if(K / arr[i] != 0){
                count += K / arr[i];
                K -= K / arr[i] * arr[i];
            }
        }
        return count;
    }

}
