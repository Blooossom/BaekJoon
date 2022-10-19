package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test25377 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int min = 1000;
        int answer = 0;
        int count = T;
        for (int i = 0; i <T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A>B){
                count--;
            }else {
                if(min>B-A){
                    min=B-A;
                    answer = B;
                }else if (min==B-A);
                answer = (int)Math.min(answer,B);
            }

        }
        if(count==0){
            System.out.println(-1);
        }else {
            System.out.println(answer);
        }
    }
}
