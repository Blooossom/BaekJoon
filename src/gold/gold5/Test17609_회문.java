package gold.gold5;

import java.io.*;
public class Test17609_회문 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String input = br.readLine();
            System.out.println(TwoPointer(input, 0, input.length() - 1, 0));
        }
    }
    static int TwoPointer(String str, int sp, int ep, int param) {
        while (sp < ep) {
            if (str.charAt(sp) == str.charAt(ep)) {
                sp++;
                ep--;
            }
            if (param != 0) {
                return 2;
            }
            param++;
            int answer = TwoPointer(str, sp, ep - 1, param);
            if (answer == 1) {
                ep--;
            }
            answer = TwoPointer(str, sp + 1, ep, param);
            if (answer == 1) {
                sp++;
            }
        }
        return param;
    }
}
