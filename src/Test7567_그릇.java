import java.io.*;
public class Test7567_그릇 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");
        int height = 10;
        for (int i = 1; i < arr.length; i++) {
            height += arr[i].equals(arr[i - 1])? 5:10;
        }
        System.out.println(height);
    }
}
