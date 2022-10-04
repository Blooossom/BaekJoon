package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test11943 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), " ");
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());

        int M = A+D;
        int N = B+C;

        if(M>N){
            System.out.println(N);
        } else System.out.println(M);

        }
    }

