package bronze.bronze4;
import java.io.*;
public class Test17362 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {2,1,2,3,4,5,4,3};
        int N = Integer.parseInt(br.readLine());
        System.out.println(arr[N%8]);
    }
}
