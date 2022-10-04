package bronze.bronze5;

import java.io.*;
public class Test24078 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int X = Integer.parseInt(br.readLine());

        sb.append(X%21);
        System.out.println(sb);
    }
}
