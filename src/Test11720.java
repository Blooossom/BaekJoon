import java.io.*;
public class Test11720 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String input = br.readLine();

        int sum = 0;
        for (int i = 0; i <N; i++) {
            sum += Integer.parseInt(input.substring(i,i+1));
        }
        System.out.println(sum);
    }
}
