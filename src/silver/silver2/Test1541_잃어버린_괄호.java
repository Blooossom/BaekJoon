package silver.silver2;

import java.io.*;
import java.util.StringTokenizer;

public class Test1541_잃어버린_괄호 {
    public static int sum = Integer.MAX_VALUE;
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        //Solution(input);
        splitSolution(input);
        System.out.println(sb);

    }
    public static void splitSolution(String input) {
        String[] minusSplit = input.split("-");
        for (int i = 0; i < minusSplit.length; i++) {
            int temp = 0;

            String[] plusSplit = minusSplit[i].split("\\+");

            for (String val:plusSplit) {
                temp += Integer.parseInt(val);
            }
            if (sum == Integer.MAX_VALUE) {
                sum = temp;
            }
            else {
                sum -= temp;
            }
        }
        sb.append(sum);
    }
    public static void Solution(String input) {
        StringTokenizer minus = new StringTokenizer(input, "-");
        while (minus.hasMoreTokens()) {
            int temp = 0;

            StringTokenizer plus = new StringTokenizer(minus.nextToken(), "+");

            while (plus.hasMoreTokens()) {
                temp += Integer.parseInt(plus.nextToken());
            }
            sum = sum == Integer.MAX_VALUE? temp : sum - temp;
        }
        sb.append(sum);
    }

}
