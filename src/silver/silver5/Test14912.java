package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test14912 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int d = Integer.parseInt(st.nextToken());
        int[] arr = new int[10];
        for (int i = 1; i <=n; i++) {
            String temp = Integer.toString(i);
            for (int j = 0; j <temp.length(); j++) {
                arr[Character.getNumericValue(temp.charAt(j))]++;
            }
        }
        System.out.println(arr[d]);
    }
}
