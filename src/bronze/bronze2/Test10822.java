package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test10822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        int count = st.countTokens();
        int sum =0;
        for (int i = 0; i <count; i++) {
            sum+= Integer.parseInt(st.nextToken());
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum);
        System.out.println(sb);
    }
}
