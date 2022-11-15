package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test2167 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        for (int i = 0; i <arr.length; i++) {
            st= new StringTokenizer(br.readLine());
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]= Integer.parseInt(st.nextToken());
            }
        }
        int K = Integer.parseInt(br.readLine());
        for (int i = 0; i <K; i++) {
            int sum = 0;
            st=new StringTokenizer(br.readLine());
            int I = Integer.parseInt(st.nextToken());
            int J = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());
            int Y = Integer.parseInt(st.nextToken());
            for (int j = I-1; j <X; j++) {
                for (int k = J-1; k <Y; k++) {
                    sum+=arr[j][k];
                }
            }
            System.out.println(sum);
        }

    }
}
