import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
public class Test10950 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for(int i = 1; i<=T; i++){
            st  = new StringTokenizer(br.readLine());
            bw.write((Integer.parseInt(st.nextToken()))+(Integer.parseInt(st.nextToken()))+"\n");
        }bw.close();

    }
}
