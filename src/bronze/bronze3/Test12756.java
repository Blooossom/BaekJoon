package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test12756 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[][] A = new int[2][2];
        for(int i=0; i<2; i++){
            st = new StringTokenizer(br.readLine());

            for(int j=0; j<2; j++){
                A[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        while (true) {
            A[0][1]=A[0][1]-A[1][0];
            A[1][1]=A[1][1]-A[0][0];
            if(A[1][1]<=0&&A[0][1]<=0){
                System.out.println("DRAW");
                break;
            }
            if(A[1][1]<=0||A[0][1]<=0){
                if (A[1][1] <= 0) {
                    System.out.println("PLAYER A");
                }else {
                    System.out.println("PLAYER B");
                }
                break;
            }
        }
    }
}
