import java.io.*;
import java.util.StringTokenizer;

public class Test10824 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());
        long D = Long.parseLong(st.nextToken());

        String a = Long.toString(A);
        String b = Long.toString(B);
        String c = Long.toString(C);
        String d = Long.toString(D);

        long result = Long.parseLong(a + b)+ Long.parseLong(c + d);

    }
}
