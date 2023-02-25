package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test14582_오늘도_졌다 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] teamA = new int[9];
        int[] teamB = new int[9];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            teamA[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 9; i++) {
            teamB[i] = Integer.parseInt(st.nextToken());
        }
        boolean check = false;
        int base = 0;
        for (int i = 0; i < 9; i++) {
            base += teamA[i];
            if (base > 0) {
                check = true;
            }
            base -= teamB[i];
        }
        System.out.println(check? "Yes":"No");
    }
}
