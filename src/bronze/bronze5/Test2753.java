package bronze.bronze5;
import java.io.*;
public class Test2753 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        System.out.println(function(T)? 1:0);

    }
    static boolean function(int param) {
        if (param % 4 == 0) {
            if (param % 400 == 0) {
                return true;
            }
            else if (param % 100 == 0) {
                return false;
            }
            else {
                return true;
            }
        }
        return false;
    }

}
