package bronze.bronze5;
import java.io.*;
import java.util.StringTokenizer;

public class Test14652 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        sb.append(K/M).append(" ").append(K%M);
        System.out.print(sb);

    }
}
/*
int[][] arr = new int[N][M];
        int count = 0;
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr[0].length; j++) {
                arr[i][j]=count;
                count++;
                if(arr[i][j]==K){
                    System.out.println(i+" "+j);
            }
        }
        }

 */
