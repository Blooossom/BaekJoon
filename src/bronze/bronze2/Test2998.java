package bronze.bronze2;
import java.io.*;
import java.util.Arrays;

public class Test2998 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

       if(str.length()%3==1){
           str="00"+str;
       }else if(str.length()%3==2){
           str = "0"+str;
       }
        String[] arr = new String[str.length()/3];
        for (int i = 0; i <(str.length()/3); i++) {
            arr[i]=str.substring(3*i, (3*i)+3);
        }
        String answer = "";
        for (int i = 0; i < arr.length; i++) {
            String value ="";
            switch (arr[i]){
                case "000": value="0";
                            break;
                case "001": value="1";
                            break;
                case "010": value="2";
                            break;
                case "011": value="3";
                            break;
                case "100": value="4";
                            break;
                case "101": value="5";
                            break;
                case "110": value="6";
                            break;
                case "111": value="7";
                            break;

            }
            answer = answer + value;
        }
        System.out.print(answer);
    }
}
