package bronze.bronze3;
import java.io.*;
public class Test23810 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());


            for (int j = 0; j <N; j++) {
                System.out.print("@".repeat(5*N));
                System.out.println();
            }
        for (int j = 0; j <N; j++) {
            System.out.print("@".repeat(N));
            System.out.println();
        }
        for (int j = 0; j <N; j++) {
            System.out.print("@".repeat(5*N));
            System.out.println();
        }
        for (int j = 0; j <2*N; j++) {
            System.out.print("@".repeat(N));
            System.out.println();
        }

    }
}
