package silver.silver5;
import java.io.*;
public class Test14916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        if(T == 1 || T ==3){
            System.out.println(-1);
        } else if (T % 5 == 0) {
            System.out.println(T / 5);
        } else if (T % 5 == 4) {
            System.out.println(2 + ((T - 4) / 5));
        } else if (T % 5 == 3) {
            System.out.println(4 + ((T - 8) / 5));
        } else if (T % 5 == 2) {
            System.out.println(1 + ((T - 2) / 5));
        } else {
            System.out.println(3 + ((T - 6) / 5));
        }
    }
}
