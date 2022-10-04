package bronze.bronze4;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Test2742 {
    public static void main(String[] args)throws IOException  {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        System.out.println(N);
        while(true){
            if(N==1)break;
            N--;
            System.out.println(N);
        }
    }
}
