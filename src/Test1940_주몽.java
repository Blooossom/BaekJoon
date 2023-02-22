import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1940_주몽 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int criteria = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int sp = 0;
        int ep = T - 1;
        int count = 0;
        while (sp < ep) {
            if (arr[ep] >= criteria) {
                ep--;
                count++;
            }
            if (arr[sp] >= criteria) {
                sp++;
                count++;
            }
            if (arr[sp] + arr[ep] >= criteria) {
                sp++;
                ep--;
                count++;
            }
            else {
                sp++;
            }
        }
        System.out.println(count);

    }
}
