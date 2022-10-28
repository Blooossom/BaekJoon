package Unsolved;
import java.io.*;
import java.util.StringTokenizer;

public class Test14173 {
    public static int[] arr(int[] arr) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        int[] X = new int[4];
        int[] Y = new int[4];
        arr(X);
        arr(Y);
        int width = (int) Math.max(X[2], Y[2]) - (int) Math.min(X[0], Y[0]);
        int height = (int) Math.max(X[3], Y[3]) - (int) Math.min(X[1], Y[1]);
        if (width == height) {
            System.out.println(width * height);
        } else {
            System.out.println((int) Math.pow(Math.max(width, height), 2));
        }
    }
}
