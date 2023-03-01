package bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Test2490_윷놀이 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        for (int i = 0; i < 3; i++) {
            int count = 0;
            int param = 0;
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 4; j++) {
                param = Integer.parseInt(st.nextToken());
                if (param == 0) {
                    count++;
                }
            }
            System.out.println(Solution(count));
        }
    }
    private static String Solution(int param) {
        switch (param) {
            case 1:
                return "A";
            case 2:
                return "B";
            case 3:
                return "C";
            case 4:
                return "D";
            case 0:
                return "E";
            default:
                return null;
        }
    }
}
