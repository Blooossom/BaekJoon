package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test1350 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        long answer = 0;
        long[] file = new long[n];
        st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        for (int i = 0; i <count; i++) {
            file[i] = Integer.parseInt(st.nextToken());
        }
        long size = Integer.parseInt(br.readLine());
        for (int i = 0; i <file.length; i++) {
            if(file[i]==0){
             continue;
            }else {
                if (file[i]<=size) {
                    answer += size;
                }else {
                    if (file[i] % size == 0) {
                        answer += size * (file[i] / size);
                    } else {
                        answer += size * ((file[i] / size) + 1);
                    }
                }
            }
        }
        System.out.println(answer);
    }

}
