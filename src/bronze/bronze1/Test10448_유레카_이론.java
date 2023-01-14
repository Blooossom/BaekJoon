package bronze.bronze1;

import java.io.*;
public class Test10448_유레카_이론 {
    static int[] arr = new int[45];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = Integer.parseInt(br.readLine());
        triangle();
        for (int i = 0; i < input; i++) {
            int param = Integer.parseInt(br.readLine());

            if (eureka(param)) {
                bw.write("1");
            } else {
                bw.write("0");
            }
            bw.write('\n');
        }
        bw.flush();
    }

    static boolean eureka(int param) {
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

    static void triangle() {
        for (int i = 1; i <45; i++) {
            arr[i] = i * (i + 1) / 2;
        }
    }
}