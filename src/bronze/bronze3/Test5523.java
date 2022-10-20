package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test5523 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int a=0;
        int b=0;
        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            if(A>B){
                a++;
            }else if(A<B){
                b++;
            }
        }
        System.out.println(a+" "+b);
    }
}
