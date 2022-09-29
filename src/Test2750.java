import java.io.*;
import java.util.Arrays;
public class Test2750 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                int tmp = arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=tmp;
            }else break;
        }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append('\n');
        }
        System.out.println(sb);
    }
}
