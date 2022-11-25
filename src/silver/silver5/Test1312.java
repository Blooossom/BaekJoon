package silver.silver5;

import java.io.*;
import java.util.StringTokenizer;

public class Test1312 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int temp = 0;
        if(A%B!=0){
            if(A>B){
                A=A%B;
            }
            for (int i = 0; i <n-1 ; i++) {
                A*=10;
                A=A%B;
            }
            A*=10;
            temp = A/B;
        }
        System.out.println(temp);

    }
}
