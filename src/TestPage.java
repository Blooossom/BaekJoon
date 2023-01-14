import java.io.*;
import java.util.*;

public class TestPage {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        int max = 1;
        int[] count1 = new int[N];
        int[] count2 = new int[N];
        int ep = 0;
        int ep1 = 0;
        int ep2 = 0;
        int temp1 = 0;
        int temp2 = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if (arr[i] == 1) {
                if (i > 0) {
                    count1[i] = count1[i - 1] + 1;
                    count2[i] = count2[i - 1];
                }
                else {
                    count1[i]++;
                }
            }
            else {
                if (i > 0) {
                    count2[i] = count2[i - 1] + 1;
                    count1[i] = count1[i - 1];
                }
                else {
                    count2[i]++;
                }
            }
            int abs = Math.abs(count2[i] - count1[i]);
            if (max <= abs){
                max = abs;
                ep = i;
            }
            if (count1[i] > temp1) {
                temp1 = count1[i];
                ep1 = i;
            }
            if (count2[i] > temp2) {
                temp2 = count2[i];
                ep2 = i;
            }
        }

        for (int i = 0; i < ep; i++) {
            max = Math.max(max,Math.abs((count2[ep] - count2[i]) - (count1[ep] - count1[i])));
        }
        for (int i = 0; i < ep1; i++) {
            max = Math.max(max,Math.abs((count2[ep1] - count2[i]) - (count1[ep1] - count1[i])));
        }
        for (int i = 0; i < ep2; i++) {
            max = Math.max(max,Math.abs((count2[ep2] - count2[i]) - (count1[ep2] - count1[i])));
        }
        System.out.println(max);
    }
}