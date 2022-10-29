package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test1978 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int answer = 0;
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i <T; i++) {
            int count = 0;
            int a = Integer.parseInt(st.nextToken());
            for (int j = 1; j <=a; j++) {
                if(a%j==0){
                    count++;
                }
            }
            if(count==2){
                answer++;
            }
        }
        System.out.println(answer);
    }
}
