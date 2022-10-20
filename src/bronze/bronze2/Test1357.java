package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test1357 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String X = st.nextToken();
        String Y = st.nextToken();
        String Z = Integer.toString(reverse(X)+reverse(Y));
        System.out.print(reverse(Z));
    }
    public static int reverse(String a){
        StringBuilder sb = new StringBuilder(a);
        int A = Integer.parseInt(sb.reverse().toString());
        return A;
    }
}
