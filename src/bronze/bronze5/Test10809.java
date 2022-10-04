package bronze.bronze5;

import java.io.*;

public class Test10809 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] ind = new int[26];
        for (int i = 0; i < ind.length; i++) {
            ind[i] = -1;
        }
        String str = br.readLine();
        for (int i = 0; i <str.length(); i++) {
            ind[str.charAt(i)-97]=str.indexOf(str.charAt(i));
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <26; i++) {
            sb.append(ind[i]+" ");
        }
        System.out.println(sb);
    }
}
