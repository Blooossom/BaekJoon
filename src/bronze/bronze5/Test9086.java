package bronze.bronze5;

import java.io.*;
public class Test9086 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <T; i++) {

            arr[i]=br.readLine();
            char start = arr[i].charAt(0);
            char end = arr[i].charAt(arr[i].length()-1);
            sb.append(start).append(end).append('\n');

        }System.out.print(sb);
    }
}
