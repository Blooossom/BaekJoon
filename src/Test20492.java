import java.io.*;
import java.util.StringTokenizer;
public class Test20492 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append(String.format("%.0f",N*0.78)).append(" ").append(String.format("%.0f",(N*0.8+(N*0.2*0.78))));

        System.out.println(sb);

    }

}
