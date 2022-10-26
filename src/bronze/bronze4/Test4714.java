package bronze.bronze4;
import java.io.*;
public class Test4714 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            double X = Double.parseDouble(br.readLine());
            if(X<0){
                break;
            }
            double Y = X*0.167;
            System.out.println("Objects weighing "+String.format("%.2f",X)+" on Earth will weigh "+String.format("%.2f",Y)+" on the moon.");
        }
    }
}
