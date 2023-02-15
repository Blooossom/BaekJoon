package bronze.bronze1;

import java.io.*;

public class Test1110 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int count = 0;
        int temp = input;

        while(true) {
            input = (input % 10) * 10 + ((input / 10) + (input % 10)) % 10;
            count++;
            if (temp == input) {
                break;
            }
        }
        System.out.println(count);
    }
}
