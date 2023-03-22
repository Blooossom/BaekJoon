import java.io.*;
public class Test10769_행복한지_슬픈지 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int happy = -1;
        int unhappy = -1;
        for (int i = 1; i < input.length() - 1; i++) {
            if (input.charAt(i) == '-') {
                if (input.charAt(i - 1) == ':') {
                    if (input.charAt(i + 1) == ')') {
                        happy++;
                    }
                    else if (input.charAt(i + 1) == '(') {
                        unhappy++;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        if (happy == -1 && unhappy == -1) {
            sb.append("none");
            System.out.println(sb);
            return;
        }
        if (happy > unhappy) {
         sb.append("happy");
        }
        else if (happy == unhappy) {
            sb.append("unsure");
        }
        else {
            sb.append("sad");
        }
        System.out.println(sb);

    }
}
