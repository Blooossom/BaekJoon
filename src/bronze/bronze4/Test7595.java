package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test7595 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            int T = Integer.parseInt(br.readLine());
            if(T==0){
                break;
            }
            for (int i = 1; i <=T; i++) {
                System.out.println("*".repeat(i));
            }
        }
    }
}
