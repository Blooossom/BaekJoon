package bronze.bronze3;
import java.io.*;
public class Test11721 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder sb = new StringBuilder();
        int N = input.length()/10;
        for (int i = 0; i <N; i++) {
            sb.append(input.substring((i*10),((i+1)*10))).append("\n");
        }
        if(input.length()%10!=0) {
            sb.append(input.substring((N * 10)));
        }
        System.out.println(sb);
    }
}
