package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Test13305_주유소 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N, length[], price[];
        N = Integer.parseInt(br.readLine());
        length = new int[N - 1];
        price = new int[N];

        long min = Integer.MAX_VALUE, result = 0;

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N - 1; i++) {
            length[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            price[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 1; i < N; i++) {
            min = Math.min(min, price[i - 1]);
            result += min * length[i - 1];
        }
        System.out.println(result);
    }
}
