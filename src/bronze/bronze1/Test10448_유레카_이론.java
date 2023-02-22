package bronze.bronze1;

import java.io.*;
public class Test10448_유레카_이론 {
    static int[] arr = new int[45];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        triangle();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input; i++) {
            int param = Integer.parseInt(br.readLine());
            sb.append(eureka(param)? 1:0).append('\n');
        }
        System.out.println(sb);
    }

    public static boolean eureka(int param) {
        for (int i = 1; i < 45; i++) {
            for (int j = 1; j < 45; j++) {
                for (int k = 1; k < 45; k++) {
                    if (arr[i] + arr[j] + arr[k] == param) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static void triangle() {
        for (int i = 1; i <45; i++) {
            arr[i] = i * (i + 1) / 2;
        }
    }
}