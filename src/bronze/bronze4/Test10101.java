package bronze.bronze4;
import java.io.*;
public class Test10101 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        if(A+B+C==180){
            if(A==B&&B==C){
                System.out.println("Equilateral");
            } else if (A==B || B==C || A==C) {
                System.out.println("Isosceles");
            }else System.out.println("Scalene");
        }else System.out.println("Error");
    }
}
