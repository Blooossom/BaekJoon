package bronze;
import java.io.*;
import java.util.StringTokenizer;

public class Test13223 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), ":");

        int H = Integer.parseInt(st.nextToken());
        int count = 0;
        for (int i = 0; i < H; i++) {
            count ++;
            if(count==12){
                count=0;
            }
        }
        H=count;
        int M = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine(), ":");
        int h = Integer.parseInt(st.nextToken());
        count=0;
        for (int i = 0; i <h; i++) {
            count ++;
            if(count==12){
                count=0;
            }
        }
        h = count;
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int sum = H*3600+M*60+S;
        int sum1 = h*3600+M*60+s;

        int result = (int)Math.abs(sum1-sum);
        System.out.println(result/3600+":"+(result%3600)/60+":"+((result%3600)%60));

    }
}
