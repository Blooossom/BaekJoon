package silver.silver4;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1026 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        int[] B = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        Arrays.sort(B);
        System.out.println(calc(A, B));

    }
    static int calc(int[] arr, int[] arr2){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[arr.length - 1 - i] * arr2[i];
        }
        return sum;
    }
}
