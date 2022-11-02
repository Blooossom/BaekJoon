package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test2609 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(GCD(x,y)).append('\n').append(LCM(x,y));
        System.out.println(sb);
    }
    public static int GCD(int a, int b){
        if(b==0){
            return a;
        }else{
            return GCD(b, a%b);
        }
    }
    public static int LCM(int a, int b){
        return a*b/GCD(a,b);
    }
}
