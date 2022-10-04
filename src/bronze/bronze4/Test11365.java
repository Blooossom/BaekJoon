package bronze.bronze4;
import java.io.*;
public class Test11365 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb;

        while(true){
            String str = br.readLine();
            if(str.equals("END"))break;

            sb = new StringBuilder(str);
            String rev = sb.reverse().toString();
            System.out.println(rev);
        }
    }
}
