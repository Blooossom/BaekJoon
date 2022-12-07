package silver.silver4;

import java.io.*;
import java.util.StringTokenizer;

public class Test24498 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        br.close();
        System.out.println(solution(arr));
    }
    static int solution(int[] arr){
        int res = 0;
        int right = 0;
        int left = 0;
        for (int i = 1; i < arr.length-1; i++) {
            int temp = arr[i] + Math.min(arr[i-1], arr[i+1]);
            if(temp > res + Math.min(left, right) && arr[i-1] >= 1 && arr[i+1] >= 1){
                left = arr[i-1];
                right = arr[i+1];
                res = arr[i];
            }
        }
        res = res + Math.min(left, right);
        return Math.max(arr[arr.length-1], Math.max(res, arr[0]));
    }
}
