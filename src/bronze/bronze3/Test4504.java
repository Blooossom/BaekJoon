package bronze.bronze3;
import java.io.*;
public class Test4504 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        while(true){
            int K = Integer.parseInt(br.readLine());
            if(K==0){
                break;
            }
            if(K%N==0){ System.out.println(K +" is a multiple of "+N+".");}
            else{
                System.out.println(K+" is NOT a multiple of "+N+".");
            }
        }
    }
}
