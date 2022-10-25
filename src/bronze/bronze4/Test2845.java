package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test2845 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int L = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());
        int[] arr = new int[5];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i <arr.length; i++) {
            System.out.print(arr[i]-L*P+" ");
        }
    }
}
