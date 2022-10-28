package bronze.bronze3;
import java.io.*;
public class Test4740 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("***")){
                break;
            }
            StringBuilder sb = new StringBuilder(str);
            String rev = sb.reverse().toString();
            System.out.println(rev);
        }

    }
}
