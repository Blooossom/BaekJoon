package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test11944 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String answer= "";

        for (int i = 0; i <N; i++) {
            answer += Integer.toString(N);
        }
        if(answer.length()>M){
            for (int i = 0; i <M; i++) {
                System.out.print(answer.charAt(i));
            }
        }else {
            System.out.print(answer);
        }

    }
}
