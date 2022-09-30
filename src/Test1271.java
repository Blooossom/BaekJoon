import java.io.*;
import java.util.StringTokenizer;

public class Test1271 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double N = Double.parseDouble(st.nextToken());
        double M = Double.parseDouble(st.nextToken());

        double result = (N/M);
        double remain = (N%M);
        System.out.println(result);
        System.out.println(remain);


    }
}
