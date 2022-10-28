package Unsolved;
import java.io.*;
public class Test16916 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String input = br.readLine();
        System.out.println(check(str,input));;
    }
    public static int check(String str, String input){
        StringBuilder sb = new StringBuilder(str);
        return sb.toString().contains(input)? 1:0;
    }
}
