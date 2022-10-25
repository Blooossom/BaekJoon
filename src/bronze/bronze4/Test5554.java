package bronze.bronze4;
import java.io.*;
public class Test5554 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        for (int i = 0; i <4; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum/60).append("\n")
                .append(sum%60);
        System.out.print(sb);
    }
}
