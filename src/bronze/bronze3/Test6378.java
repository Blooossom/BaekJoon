package bronze.bronze3;
import java.io.*;
import java.math.BigInteger;

public class Test6378 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            //BigInteger input = new BigInteger(br.readLine());
            String str = br.readLine();
            if(str.equals("0")){
                break;
            }
            while(true){
                int sum = 0;

                for (int i = 0; i <str.length(); i++) {
                    sum += Character.getNumericValue(str.charAt(i));
                }
                if(sum<10){
                    System.out.println(sum);
                    break;
                }
                str= Integer.toString(sum);
            }

        }
    }
}
