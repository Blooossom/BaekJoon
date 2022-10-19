package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test25494 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            int z = Integer.parseInt(st.nextToken());
            int count = 0;
            for (int j = 1; j <=x; j++) {
                for (int k = 1; k <=y; k++) {
                    for (int l = 1; l <=z; l++) {
                        if(j%k==k%l&&k%l==l%j){
                            count++;
                        }
                    }

                }
            }
            System.out.println(count);
        }
    }
}
