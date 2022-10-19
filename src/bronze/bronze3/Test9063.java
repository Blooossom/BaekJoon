package bronze.bronze3;
import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test9063 {
    public static void main(String[] args) throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] x = new int[N];
        int[] y = new int[N];
        StringTokenizer st;
        for (int i = 0; i <N; i++) {
            st=new StringTokenizer(br.readLine());
            x[i]= Integer.parseInt(st.nextToken());
            y[i]= Integer.parseInt(st.nextToken());
        }
        Arrays.sort(x);
        Arrays.sort(y);
        System.out.print((x[x.length-1]-x[0])*(y[y.length-1]-y[0]));
    }
}
