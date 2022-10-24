package bronze.bronze3;
import java.io.*;
public class Test2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int quarter = 0;
        int dime = 0;
        int nickel = 0;
        int penny = 0;
        for (int i = 0; i < T; i++) {
            int count = 0;
            int input = Integer.parseInt(br.readLine());
            quarter = input / 25;
            input = input % 25;
            dime = input / 10;
            input = input % 10;
            nickel = input / 5;
            input = input % 5;
            penny = input / 1;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }
    }
}