import java.io.*;
public class Test1343_폴리오미노 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        if (input.length() == 1) {
            System.out.println(-1);
            return;
        }
        StringBuilder sb = new StringBuilder();
        int sp = 0;
        int ep = 0;
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            ep = i;
            char check = input.charAt(i);
            if (check == '.' || ep == input.length()) {
                count = ep - sp;
                System.out.println(count);
                if (count % 2 != 0) {
                    System.out.println(-1);
                    return;
                }
                else {
                    if (count == 2) {
                        sb.append("BB");
                    } else if (count % 4 == 0) {
                        String temp = "AAAA".repeat(count / 4);
                        sb.append(temp);
                    } else {
                        String temp = "AAAABB".repeat(count / 6);
                        sb.append(temp);
                    }
                }
                if (check == '.'){
                    sb.append('.');
                }
                sp = ep;
            }
        }
        System.out.println(sb);
    }
}
