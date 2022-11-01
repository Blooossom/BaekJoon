package silver.silver5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test1789 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        int count = 0;
        int i = 1;
        while(true){
            S=S-i;
            i++;
            count++;
            if (S<i) {
                break;
            }
        }
        System.out.println(count);
    }
}
