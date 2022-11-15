import java.io.*;
import java.util.ArrayList;

public class Test1065 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int count = 0;
        if(T>=100){
            count=99;
            for (int i = 100; i <=T; i++) {
                if(i/100-(i%100)/10==(i%100)/10-i%10){
                    count++;
                }
            }
        }else{
            for (int i = 0; i <T; i++) {
                count++;
            }
        }
        System.out.println(count);
    }
}
