package bronze.bronze2;
import java.io.*;
public class Test1964 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long answer = 1;
        long fomula = 1;
        for (int i = 0; i <N; i++) {
            fomula=fomula+3;
            answer = answer+fomula;
        }
        System.out.print(answer%45678);
    }
}
