package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test11908 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st=new StringTokenizer(br.readLine());
        int count = st.countTokens();
        for (int i = 0; i <count; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sum = 0;
        for (int i = 0; i <arr.length-1; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
}
