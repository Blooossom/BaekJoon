package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test13597 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        if(A==B){
            System.out.println(A);
        }else if(A<B){
            System.out.println(B);
        }else{
            System.out.println(A);
        }
    }
}
