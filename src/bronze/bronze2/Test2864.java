package bronze.bronze2;

import java.io.*;
import java.util.StringTokenizer;

public class Test2864 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        result(a, b);
    }
    static void result(String a, String b){
        int min = 0;
        int max = 0;
        String[] p = a.split("");
        String[] q = b.split("");
        min = Integer.parseInt(minimum(p)) + Integer.parseInt(minimum(q));
        max = Integer.parseInt(maximum(p)) + Integer.parseInt(maximum(q));
        System.out.println(min + " " + max);
    }
    static String minimum(String[] a){
        String res = "";
        for (int i = 0; i <a.length; i++) {
            if (a[i].equals("6")) {
                a[i]="5";
            }
            res = res + a[i];
        }
        return res;
    }
    static String maximum(String[] a){
        String res = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals("5")) {
                a[i]="6";
            }
            res = res + a[i];
        }
        return res;
    }
}
