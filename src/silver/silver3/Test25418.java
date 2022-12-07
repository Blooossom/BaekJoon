package silver.silver3;

import java.io.*;
import java.util.StringTokenizer;

public class Test25418 {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        System.out.println(Solution(B, A));
    }
    static int Solution(int a, int b){
        if (a == b) {
            return count;
        }
        if (a % 2 == 0) {
            if (a / 2 < b) {
                System.out.println(count);
                System.out.println(a-b);
                return count + a - b;
            }
            count++;
            return Solution(a/2, b);
        } else {
            count++;
            return Solution(a - 1, b);
        }
    }
}
