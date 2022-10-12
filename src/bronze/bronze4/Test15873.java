package bronze.bronze4;
import java.io.*;
public class Test15873 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int A=0;
        int B=0;
        if(input.length()==4){
            System.out.println(20);
            return;
        }else {
            if(input.charAt(input.length()-1)=='0'){
                A = Integer.parseInt(input.substring(0,1));
                B = Integer.parseInt(input.substring(1));
            }else{
                A = Integer.parseInt(input.substring(0,input.length()-1));
                B = Integer.parseInt(input.substring(input.length()-1));
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(A+B);
        System.out.print(sb);
    }
}
