package bronze.bronze4;
import java.io.*;
public class Test24883 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        if(input.equals("N")||input.equals("n")){
            sb.append("Naver D2");
        }else{
            sb.append("Naver Whale");
        }
        System.out.println(sb);
    }
}
