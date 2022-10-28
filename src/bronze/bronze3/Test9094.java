package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test9094 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int b = 2; b <n; b++) {
                for (int a = 1; a <b; a++) {
                    if(((Math.pow(a,2)+Math.pow(b,2)+m)/(a*b))%1==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
