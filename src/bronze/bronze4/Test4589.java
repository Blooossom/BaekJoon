package bronze.bronze4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test4589 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        System.out.println("Gnomes:");
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(a<=b&&b<=c||c<=b&&b<=a){
                System.out.println("Ordered");
            }else{
                System.out.println("Unordered");
            }
        }
    }
}
