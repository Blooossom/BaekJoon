package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test25191 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int chicken = A/2+B;
        if(chicken>T){
            chicken=T;
        }
        System.out.println(chicken);
    }
}
