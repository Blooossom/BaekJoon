package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test10214 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i <T; i++) {
            int sum = 0;
            for (int j = 0; j <9; j++) {
                st = new StringTokenizer(br.readLine());
                sum += (Integer.parseInt(st.nextToken())- Integer.parseInt(st.nextToken()));
            }
            if(sum<0){
                System.out.print("Korea");
            } else if (sum>0) {
                System.out.print("Yonesei");
            }else{
                System.out.print("Draw");
            }
            System.out.println();
        }
    }
}
