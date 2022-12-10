package bronze.bronze2;

import java.io.*;
public class Test25501 {
    static int count = 0;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            System.out.println(isPalindrome(str) + " " + count);
            count = 0;
        }
    }
    static int recrusion(String str, int p, int q){
        if (p >= q) {
            return 1;
        } else if (str.charAt(p) != str.charAt(q)) {
            return 0;
        }else{
            count++;
            return recrusion(str, p + 1, q - 1);
        }
    }
    static int isPalindrome(String str){
        count++;
        return recrusion(str, 0, str.length() - 1);
    }
}
