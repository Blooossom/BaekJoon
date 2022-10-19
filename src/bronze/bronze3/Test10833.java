package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test10833 {
    public static void main(String[] args) throws IOException{
        BufferedReader  br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            st= new StringTokenizer(br.readLine());
            int student = Integer.parseInt(st.nextToken());
            int apple = Integer.parseInt(st.nextToken());
            sum += (apple%student);
        }
        System.out.print(sum);
    }
}
