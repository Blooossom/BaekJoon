package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test10797 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st= new StringTokenizer(br.readLine());
        for (int i = 0; i <5; i++) {
            int input = Integer.parseInt(st.nextToken());
            if(N== input){
                arr[N]++;
            }
        }
        System.out.print(arr[N]);
    }
}
