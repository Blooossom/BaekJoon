import java.io.*;
public class Test3460_이진수 {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            int input = Integer.parseInt(br.readLine());
            String Binary = Integer.toBinaryString(input);
            for (int j = Binary.length() - 1; j >= 0; j--) {
                if (Binary.charAt(j) == '1') {
                    sb.append(Binary.length() - 1 - j).append(' ');
                }
            }
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
