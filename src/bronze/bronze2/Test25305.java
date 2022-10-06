package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test25305 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st=new StringTokenizer(br.readLine()," ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st=new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i <N; i++) {

            arr[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length-1; j++) {
                if(arr[i]>arr[j]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

        }
        System.out.println(arr[K-1]);
    }
}
