package bronze.bronze3;

import java.io.*;
import java.util.StringTokenizer;

public class Test4880 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a==0&&b==0&&c==0){
                break;
            }
            StringBuilder sb = new StringBuilder();
            if(b-a==c-b){
                sb.append("AP ").append(ap(a,b,c));
            }else{
                sb.append("GP ").append(gp(a,b,c));
            }
            System.out.println(sb);
        }
    }
    public static int ap(int a, int b, int c){
        int answer = 0;
        int dif = b-a;
        answer = c+dif;
        return answer;
    }
    public static int gp(int a, int b, int c){
        int answer = 0;
        int dif = b/a;
        answer = c*dif;
        return answer;
    }
}
