import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Test5046_전대프연 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < Integer.parseInt(arr[2]); i++) {
            int price = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < Integer.parseInt(arr[3]); j++) {
                int person = Integer.parseInt(st.nextToken());
                if (person >= Integer.parseInt(arr[0]) && Integer.parseInt(arr[0]) * price <= min) {
                    min = Integer.parseInt(arr[0]) * price;
                }
            }
        }
        System.out.println(min > Integer.parseInt(arr[1])? "stay home" : min);
    }
}
