package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test1712 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        if(B>=C){
            System.out.println(-1);
            return;
        }
        int i = 0;
        while(true){
            if(A+B*i<C*i){
                System.out.print(i);
                break;
            }
            i++;
        }
    }
}
