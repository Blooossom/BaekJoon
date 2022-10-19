package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test19698 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int W = Integer.parseInt(st.nextToken());
        int H = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int answer = ((W/L)*(H/L));
        if(N>=answer){
            System.out.println(answer);
        }else{
            System.out.println(N);
        }
    }
}
