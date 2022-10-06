package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test2985 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        if (A+B==C){
            sb.append(A).append("+").append(B).append("=").append(C);
        }else if(A-B==C){
            sb.append(A).append("-").append(B).append("=").append(C);
        }else if(A*B==C){
            sb.append(A).append("*").append(B).append("=").append(C);
        }else if(A/B==C){
            sb.append(A).append("+").append(B).append("=").append(C);
        }else if(B+C==A){
            sb.append(A).append("=").append(B).append("+").append(C);
        }else if(B-C==A){
            sb.append(A).append("=").append(B).append("-").append(C);
        }else if(B*C==A){
            sb.append(A).append("=").append(B).append("*").append(C);
        }else if(A==B/C){
            sb.append(A).append("=").append(B).append("/").append(C);
        }
        System.out.println(sb);
    }
}
