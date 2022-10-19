package bronze.bronze3;
import java.io.*;
public class Test10419 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i <T; i++) {
            int d= Integer.parseInt(br.readLine());
            int max = 0;
            for (int k = 0; true; k++){
               int t = d - (int)Math.pow(k,2);
                if(k+(int)Math.pow(k,2)>d){
                    break;
                }
                max=Math.max(max,k);
            }System.out.println(max);
        }
    }
}
