import java.io.*;
public class Test1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int N = Integer.parseInt(br.readLine());
            int count = 0;
            while(N>=5){
                count += N/5;
                N/=5;
            }
        System.out.println(count);
            br.close();
    }
}
