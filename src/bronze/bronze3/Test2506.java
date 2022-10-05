package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test2506 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] score = new int[N];
        for (int i = 0; i < N; i++) {
            score[i] = Integer.parseInt(st.nextToken());
        }
        int count=0;
        int result = 0;
        for (int i = 0; i < score.length; i++) {//1 0 1 1 1 0 0 1 1 0
            if(score[i]==1){
                count++;
            }else{
                count=0;
            }
            result += count;
        }

        System.out.println(result);
    }
}
