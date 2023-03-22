import java.io.*;
import java.util.HashSet;

public class Test10987_모음의_개수 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] arr = input.split("");
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("e");
        set.add("i");
        set.add("o");
        set.add("u");
        int ans = 0;
        for (String param:arr) {
            if (set.contains(param)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}
