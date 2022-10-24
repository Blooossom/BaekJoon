package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test5063 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            if(r>e-c){
                System.out.println("do not advertise");
            }else if(r==e-c){
                System.out.println("does not matter");
            }else{
                System.out.println("advertise");
            }
        }
    }
}
