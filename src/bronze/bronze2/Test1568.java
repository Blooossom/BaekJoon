package bronze.bronze2;
import java.io.*;
public class Test1568 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        int count = 0;//시간
        long i = 1;
        while(true){
            N=N-i;
            i++;
            count++;
            if(i>N){
                i=1;
            }
            if(N==0){
                break;
            }
        }
        System.out.print(count);
    }
}
