package bronze.bronze3;
import java.io.*;
public class Test10707 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int D = Integer.parseInt(br.readLine());
        int P = Integer.parseInt(br.readLine());

        int X = P*A;
        int Y;
        if( P <= C) {
            Y=B;
        }else{
            Y=B+((P-C)*D);
        }
        System.out.println(Math.min(X,Y));
    }
}
