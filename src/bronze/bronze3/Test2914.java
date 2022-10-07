package bronze.bronze3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Test2914 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int i = Integer.parseInt(st.nextToken());

        if(A==1) {
            System.out.println(i);
        }else System.out.println((A*(i-1)+1));
    }
}
