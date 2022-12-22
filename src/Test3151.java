import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test3151 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static int TwoPointer(int[] arr){
        int sp = 0;
        int ep = 0;
        int sum = 0;
        int count = 0;
        while (true) {
            if(sum >= 0){
                sum -= arr[sp++];
            } else if (ep >= arr.length) {
                break;
            }else{
                sum += arr[ep++];
            }
            if(sum == 0){
                count++;
            }
        }
        return count;
    }
}
