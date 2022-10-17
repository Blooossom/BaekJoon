package bronze.bronze2;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Test1233 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] a = new int[Integer.parseInt(st.nextToken())];
        int[] b = new int[Integer.parseInt(st.nextToken())];
        int[] c = new int[Integer.parseInt(st.nextToken())];
        int[] sum = new int[a.length + b.length + c.length-2];
        for (int i = 0; i < sum.length; i++) {
            if(i<=a.length-1){a[i]=i+1;}
            if(i<=b.length-1){b[i]=i+1;}
            if(i<=c.length-1){c[i]=i+1;}
        }
        for (int value : a) {
            for (int i : b) {
                for (int j : c) {
                    sum[value + i + j - 3]++;
                }
            }
        }
        System.out.println(Arrays.toString(sum));
        int max = 0;
        int result = 0;
        for (int i = 0; i < sum.length; i++) {
            if (max < sum[i]) {
                max = sum[i];
                result = i+3;
            }
        }System.out.println(result);
    }
    }

