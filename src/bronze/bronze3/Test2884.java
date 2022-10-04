package bronze.bronze3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Test2884 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        if(H==0){
            H=24;
        }
        int tmp = (H*60)+M;
        int result = tmp - 45;

        if(result/60>23){
            H = (result/60)-24;
            M = result%60;
        }else{
            H = result/60;
            M = result%60;
        }
        System.out.println(H + " "+M);
    }
}
