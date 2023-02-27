import java.io.*;
public class Test5598_카이사르_암호 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch <= 67) {
                sb.append((char)(ch + 23));
            }
            else {
                sb.append((char)(ch - 3));
            }
        }
        System.out.print(sb);
    }
}
