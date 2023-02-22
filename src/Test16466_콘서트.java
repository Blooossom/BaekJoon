import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test16466_콘서트 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] temp = new int[T];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            int idx = Integer.parseInt(st.nextToken());
            temp[i] = idx;
        }
        Arrays.sort(temp);
        boolean[] arr = new boolean[temp[temp.length - 1] + 2];
        for (int i = 0; i < T; i++) {
            arr[temp[i]] = true;
        }
        for (int i = 1; i <= arr.length; i++) {
            if (!arr[i]) {
                System.out.println(i);
                return;
            }
        }
    }
}
