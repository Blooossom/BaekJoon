package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test5612 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int max=m;
        int result=m;
        StringTokenizer st;
        for (int i = 0; i <n; i++) {
            st=new StringTokenizer(br.readLine());
            int input = Integer.parseInt(st.nextToken());
            int output = Integer.parseInt(st.nextToken());

            result += input-output;
            if(result<0){
                max=0;
                break;
            }
            if(max<result){
                max = result;
            }
        }
        if(max==0){
            System.out.print(max);
        }else {
            System.out.print(max);
        }
    }
}
