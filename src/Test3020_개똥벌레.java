import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test3020_개똥벌레 {
    static int N, H, top[], bottom[];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());

        bottom = top = new int[N / 2];
        int up = 0, down = 0;
        int min = Integer.MAX_VALUE;
        int count = 1;

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                bottom[down++] = Integer.parseInt(br.readLine());
            }
            else {
                top[up++] = Integer.parseInt(br.readLine());
            }
        }

        Arrays.sort(top);
        Arrays.sort(bottom);

        for (int i = 1; i <= H; i++) {
            int tempDown = binary(0, N / 2 - 1, i, bottom);
            int tempUp = binary(0, N / 2 - 1, H - i + 1, top);

            if (min > tempDown + tempUp) {
                min = tempDown + tempUp;
                count = 1;
            }
            else if (min == tempDown + tempUp) {
                count++;
            }
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(Integer.toString(min) + " " + Integer.toString(count));
        bw.flush();
    }

    static int binary(int sp, int ep, int h, int[] arr) {
        int minValue = Integer.MAX_VALUE;
        while (sp <= ep) {
            int mid = (sp + ep) / 2;

            if (arr[mid] >= h) {
                minValue = Math.min(minValue, mid);
                ep = mid - 1;
            }
            else {
                sp = mid + 1;
            }
        }
        if (minValue == Integer.MAX_VALUE) {
            return 0;
        }
        else {
            return (N / 2) - minValue;
        }
    }
}
