package bronze.bronze3;

import java.io.*;
public class Test27106_Making_Change {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = 100 - Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[4];
        while (true) {
            if (input >= 25) {
                arr[0] = input / 25;
                input -= arr[0] * 25;
            }
            else if (input >= 10) {
                arr[1] = input / 10;
                input -= arr[1] * 10;
            }
            else if (input >= 5) {
                arr[2] = input / 5;
                input -= arr[2] * 5;
            }
            else {
                arr[3] = input;
                input = 0;
                break;
            }
        }
        for (int key:arr) {
            sb.append(key).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
