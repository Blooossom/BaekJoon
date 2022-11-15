package AlgorithmSrc;
import java.io.*;
public class Moduler {
    public static long C;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long A = Long.parseLong(br.readLine());
        long B = Long.parseLong(br.readLine());
        C = Long.parseLong(br.readLine());
        System.out.println(pow(A,B));
        /*
        Test
        10 11 12 > 4
        200 210 200
         */
    }
    public static long pow(long A, long exponent){
        if (exponent == 1) {
            return A%C;
        }
        long temp = pow(A,exponent/2);

        if (exponent % 2 == 1) {
            return (temp*temp%C)*A%C;
        }
        return temp*temp%C;
    }
}
