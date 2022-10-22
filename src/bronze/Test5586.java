package bronze;
import java.io.*;
public class Test5586 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int joi = 0;
        int ioi = 0;

        for (int i = 0; i <input.length()-2; i++) {
            String check = input.substring(i,i+2);
            if(check.equals("str")){
                joi++;
            }
            if(check.equals("str2")){
                ioi++;
            }
        }
        System.out.println(joi);
        System.out.println(ioi);
    }
}
