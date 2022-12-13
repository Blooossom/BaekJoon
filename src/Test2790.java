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
        int max1 = driver.get(driver.size() - 1) + 1;
        int count1 = 1;
        for (int i = driver.size() - 2; i >= 0; i--) {
            if(max1 > driver.get(i) + N){
                break;
            }
            int b = driver.get(i) + N - i;
            max1 = Math.max(b, max1);
            count1++;
        }
        System.out.println(count1);
        Collections.reverse(driver);
        int max = driver.get(0) + 1;
        int count = 1;
        for (int i = 1; i < driver.size(); i++) {
            if (max > driver.get(i) + N) {
                break;
            }
            int b1 = driver.get(i) + N - driver.size() - 1 - i;
            max = Math.max(b1, max);
            count++;
        }
        System.out.println(count);
    }
}
