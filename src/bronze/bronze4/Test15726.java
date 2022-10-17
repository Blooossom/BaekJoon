package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test15726{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());
        System.out.print((int)Math.max(A*B/C,A/B*C));
    }
}