package bronze;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test1718 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String key = br.readLine();
        String input = br.readLine();

        System.out.println(key);
        System.out.println(input);
        char[] answer = new char[input.length()];
        answer=input.toCharArray();
        for (int i = 0; i <input.length(); i++) {
            System.out.println(input.charAt(i));
        }

    }
}
