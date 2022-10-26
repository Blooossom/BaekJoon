package bronze.bronze4;
import java.io.*;
public class Test6749 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int third = Integer.parseInt(br.readLine());
        int second = Integer.parseInt(br.readLine());
        int first = second+(second-third);
        System.out.println(first);
    }
}
