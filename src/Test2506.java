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
        int count;
        int result = 0;
        for (int i = 1; i < N; i++) {//1 0 1 1 1 0 0 1 1 0
            if(score[0]==1){count = 1;}else{count = 0;}// count = 1;
            if (score[i] == 1) {
                if (score[i] == score[i - 1]) {
                    count ++;
                }else{
                    count ++;}
            } else {
                count=0;
            }
            result += count; //[0] 1/[1] 0/[[2] 1/[3]
        }

        System.out.println(result);
    }
}
