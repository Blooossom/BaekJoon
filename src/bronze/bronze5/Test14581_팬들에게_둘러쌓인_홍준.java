package bronze.bronze5;
import java.io.*;
public class Test14581_팬들에게_둘러쌓인_홍준 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String fan = ":fan:";
        StringBuilder sb = new StringBuilder();
        sb.append(fan.repeat(3));
        sb.append('\n');
        sb.append(fan).append(":" + input + ":").append(fan).append('\n').append(fan.repeat(3));
        System.out.println(sb);
    }

}
