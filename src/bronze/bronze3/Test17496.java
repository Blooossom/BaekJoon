package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test17496 {
    public static void main(String[] args) throws  IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        if(N%T==0){
            System.out.print((((N/T)-1)*C)*P);
        }else{
            System.out.print(((N/T)*C)*P);
        }
    }
}
