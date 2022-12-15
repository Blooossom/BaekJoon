package bronze.bronze3;

import java.io.*;
public class Test14920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 1;
        while (true) {
            if (T == 1) {
                System.out.println(count);;
                break;
            }
            if (T % 2 == 0) {
                T = T / 2;
            } else {
                T = (3 * T) + 1;
            }
            count++;
        }
    }
}
