package bronze.bronze5;
import java.io.*;
import java.util.StringTokenizer;

public class Test18301 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());
        int n12 = Integer.parseInt(st.nextToken());

        System.out.println((int)Math.floor((((n1+1)*(n2+1))/(n12+1)))-1);
        br.close();
    }
}
