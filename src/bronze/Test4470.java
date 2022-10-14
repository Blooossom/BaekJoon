package bronze;
import java.io.*;
public class Test4470 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        StringBuilder sb;
        for (int i = 1; i <= N; i++) {
            sb = new StringBuilder();
            sb.append(i+". ").append(br.readLine());
            System.out.println(sb);
        }

    }
}
