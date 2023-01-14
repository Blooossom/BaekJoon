import java.io.*;
import java.util.StringTokenizer;

public class TestPage3 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int[][] arr = new int[C][C];
        for (int i = 0; i < arr.length; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        int[] nArr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = Integer.parseInt(st.nextToken());
        }
        int[] mArr = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < mArr.length; i++) {
            mArr[i] = Integer.parseInt(st.nextToken());
        }
    }
}
