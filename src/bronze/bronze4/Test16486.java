package bronze.bronze4;
import java.io.*;
public class Test16486 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int d1 = Integer.parseInt(br.readLine());
        int d2 = Integer.parseInt(br.readLine());
        double pie = 3.141592;
        System.out.println((d1*2)+(2*d2*pie));

    }
}
