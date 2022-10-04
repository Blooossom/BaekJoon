import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Test10817 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int[] arr = new int[3];

        for (int i = 0; i <3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
// int A = Integer.parseInt(st.nextToken());
//        int B = Integer.parseInt(st.nextToken());
//        int C = Integer.parseInt(st.nextToken());