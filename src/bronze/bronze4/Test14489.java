package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test14489 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int C = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        if(2*C>A+B){
            sb.append(A+B);
        }else{
            sb.append(A+B-2*C);
        }
        System.out.println(sb);
    }
}
