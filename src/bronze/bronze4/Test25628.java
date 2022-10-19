package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;

public class Test25628 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int count = 0;
        if (A <= 1 || B <= 0) {
            System.out.println(0);
            return;
        }
        while (true) {
            A = A - 2;
            B = B - 1;
            count++;
            if(A <= 1 || B <= 0){
                break;
            }
        }
        System.out.println(count);
    }
}
