import java.io.*;
import java.util.*;
import java.util.StringTokenizer;

public class Test2738 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();//Integer.parseInt(st.nextToken());
        int M = sc.nextInt();//Integer.parseInt(st.nextToken());

        int[][] A = new int[N][M];
        int[][] B = new int[N][M];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j <M; j++) {
                A[i][j] = sc.nextInt();//Integer.parseInt(st.nextToken());
            }
            for(int k=0; k<N; k++){

            }
        }
        int[][] answer = new int[N][M];
        for (int i = 0; i <N; i++) {
            for (int j = 0; j < M; j++) {
                answer[i][j] = A[i][j]+B[i][j];
            }
        }
        System.out.println(Arrays.toString(answer));
    }
}
