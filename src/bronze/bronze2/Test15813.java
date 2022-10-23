package bronze.bronze2;
import java.io.*;
public class Test15813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int sum = 0;
        for (int i = 0; i <n; i++) {
            char ch = input.charAt(i);
            sum += ch-64;
        }
        System.out.println(sum);
    }
}
