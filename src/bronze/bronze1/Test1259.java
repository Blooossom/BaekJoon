package bronze.bronze1;

import java.io.*;
public class Test1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            StringBuilder sb = new StringBuilder(str);
            if(sb.toString().equals(sb.reverse().toString())){
                System.out.println("yes");
            }else{
                System.out.println("no");
            }
        }
    }
}
