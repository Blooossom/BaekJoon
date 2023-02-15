import java.io.*;
import java.util.StringTokenizer;

public class TestPage {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i < 47; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ">");
            String token = st.nextToken();
            st = new StringTokenizer(token, "<");
            String content = st.nextToken();
            st = new StringTokenizer(content);
            String res = st.nextToken();
            System.out.println("String.valueOf(" + res + ")");
        }
        System.out.println(count);
    }
}