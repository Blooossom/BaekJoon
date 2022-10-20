package bronze.bronze2;
import java.io.*;
public class Test2747 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fibonacci(N);
    }
    public static void fibonacci(int input){
        int a = 0;
        int b = 1;
        int sum = 0;
        if(input==1){
            sum = 1;
        }else {
            for (int i = 2; i <= input; i++) {
                sum = a + b;
                a = b;
                b = sum;
            }
        }
            System.out.print(sum);

    }
}
