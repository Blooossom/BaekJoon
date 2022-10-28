package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test4562 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            st=new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            if(x<y){
                System.out.println("NO BRAINS");
            }else{
                System.out.println("MMM BRAINS");
            }
        }
    }
}
