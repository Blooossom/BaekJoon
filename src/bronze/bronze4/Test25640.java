package bronze.bronze4;
import java.io.*;
public class Test25640 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String jin = br.readLine();
        int N = Integer.parseInt(br.readLine());
        int count=0;
        for (int i = 0; i <N; i++) {
            String str = br.readLine();
            if(str.equals(jin)){
                count++;
            }
        }
        System.out.println(count);
    }
}
