package silver.silver3;
import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;
public class Test14425 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        HashSet<String> set = new HashSet<>();
        for(int i=0; i<n; i++){
            set.add(br.readLine());
        }
        for(int i=0; i<m; i++){
            set.add(br.readLine());
        }
        System.out.println(m + n - set.size());
    }
}
