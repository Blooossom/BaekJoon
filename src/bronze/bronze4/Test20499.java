package bronze.bronze4;

import java.io.*;
import java.util.StringTokenizer;
public class Test20499 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),"/");
        int K = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        int A = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if(D==0){
            sb.append("hasu");
            System.out.println(sb);
            return;
        }
        if(K+A<D){
            sb.append("hasu");
            System.out.println(sb);
        }else{
            sb.append("gosu");
            System.out.println(sb);
        }

    }
}
