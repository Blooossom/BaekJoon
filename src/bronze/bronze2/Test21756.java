package bronze.bronze2;
import java.util.ArrayList;
import java.io.*;
public class Test21756 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < N; i++) {
            arr.add(i + 1);
        }
        int i = 0;
        while (true) {
            if (arr.size() == 1) {
                break;
            }
            arr.remove(i);
            i++;
            if (i >= arr.size()) {
                i = 0;
            }
        }
        System.out.println(arr.get(0));
    }
}
//