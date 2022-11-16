import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test1920 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long N = Long.parseLong(br.readLine());
        StringTokenizer st;
        ArrayList<Long> list = new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <N; i++) {
            list.add(Long.parseLong(st.nextToken()));
        }
        long M = Long.parseLong(br.readLine());
        st=new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i <M; i++) {
            if(list.contains(Long.parseLong(st.nextToken()))){
                sb.append(1).append('\n');
            }else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
    }
}
