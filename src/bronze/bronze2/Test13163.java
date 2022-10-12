package bronze.bronze2;
import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
public class Test13163 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<String> arr = new ArrayList<String>();

        StringTokenizer st;
        for (int i = 0; i <N; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            String[] str = new String[count];
            for (int j = 0; j <count; j++) {
                str[j] = st.nextToken();
            }
            str[0]="god";
            for (int k = 0; k <str.length; k++) {
                System.out.print(str[k]);
            }
            System.out.println();
        }

    }
}
