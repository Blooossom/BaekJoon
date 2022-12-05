package bronze.bronze1;

import java.io.*;
public class Test19564 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 1;
        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i)<=str.charAt(i-1)){
                count++;
            }
        }
        System.out.println(count);
    }
}
