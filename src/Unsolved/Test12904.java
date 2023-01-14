package Unsolved;

import java.io.*;
public class Test12904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        String T = br.readLine();
        System.out.println(Solution(T));
    }
    static String Solution(String str) {
        StringBuilder sb = new StringBuilder(str);
        str.replace(str.charAt(str.length() - 1), ' ');
        if (str.charAt(str.length() - 1) == 'A') {
            sb.replace(str.length()- 1, str.length() - 1, "");
        }
        else {
            sb.replace(str.length()- 2, str.length() - 1, "");
            sb.reverse();
        }
        return str;
    }
}
