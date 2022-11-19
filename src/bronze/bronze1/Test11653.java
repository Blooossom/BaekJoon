package bronze.bronze1;
import java.io.*;
public class Test11653 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int temp=N;
        StringBuilder sb = new StringBuilder();
        for(int i=2; i<=N; i++){
            while(true){
                if(temp%i!=0){
                    break;
                }
                temp=temp/i;

                sb.append(i).append("\n");
                if(temp==1)break;

            }
        }
        System.out.print(sb);
    }
}
