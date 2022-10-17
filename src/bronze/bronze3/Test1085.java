package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int[] arr = {x,y,w-x,h-y};
        int min = (int)Math.max(w,h);
        for (int i = 0; i <arr.length; i++) {
            min = Math.min(min,arr[i]);
        }
        System.out.print(min);
    }
}
