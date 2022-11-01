package silver.silver5;

import java.io.*;

public class Test15688 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[2000001];
        for (int i = 0; i <T; i++) {
            arr[Integer.parseInt(br.readLine())+1000000]++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[i]; j++) {
                sb.append(i-1000000).append("\n");
            }
        }
        System.out.println(sb);
    }
}
