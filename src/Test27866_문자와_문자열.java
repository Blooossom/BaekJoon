import java.io.*;
public class Test27866_문자와_문자열 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");
        System.out.println(arr[Integer.parseInt(br.readLine()) - 1]);
    }
}
