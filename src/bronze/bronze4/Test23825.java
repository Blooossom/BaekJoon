package bronze.bronze4;

import java.io.*;
import java.util.StringTokenizer;

public class Test23825 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        System.out.println(Math.min(N/2,M/2));
    }
}
