package bronze.bronze3;
import java.io.*;
public class Test23806 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String str1 = "@";
        String str2 = " ";

        StringBuilder sb = new StringBuilder();

        sb.append((str1.repeat(5*N)+"\n").repeat(N))
          .append(((str1.repeat(N)+str2.repeat(3*N)+str1.repeat(N))+"\n").repeat(3*N))
                .append((str1.repeat(5*N)+"\n").repeat(N));
        System.out.print(sb);
    }
}
