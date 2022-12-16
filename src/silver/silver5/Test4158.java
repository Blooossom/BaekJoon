package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Test4158 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while(true){
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if(N == 0 && M == 0){
                break;
            }
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < N; i++) {
                set.add(Integer.parseInt(br.readLine()));
            }
            int count = 0;
            for (int i = 0; i < M; i++) {
                if (set.contains(Integer.parseInt(br.readLine()))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
