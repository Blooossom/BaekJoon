package bronze.bronze4;
import java.io.*;
public class Test5532 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int L = Integer.parseInt(br.readLine());
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        while(true){
            A=A-C;
            B=B-D;
            L--;
            if(A<=0&&B<=0){
                break;
            }
        }
        System.out.println(L);
    }
}
