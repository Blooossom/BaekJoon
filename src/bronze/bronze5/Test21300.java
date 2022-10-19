package bronze.bronze5;
import java.io.*;
import java.util.StringTokenizer;

public class Test21300 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[6];
        int sum=0;
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
            sum += 5*arr[i];
        }
        System.out.println(sum);
    }
}
