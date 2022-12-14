package silver.silver2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test2790 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> driver = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            driver.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(driver);
        int max = driver.get(driver.size() - 1) + 1;
        int count = 1;
        for (int i = driver.size() - 2; i >= 0; i--) {
            if(max > driver.get(i) + N){
                break;
            }
            int b = driver.get(i) + N - i;
            max = Math.max(b, max);
            count++;
        }
        System.out.println(count);
    }
}
