import java.io.*;
public class Test5586_JOI와IOI {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        StringBuilder res = new StringBuilder();
        if (input.length() < 3) {
            res.append(0).append('\n').append(0);
            System.out.println(res);
            return;
        }
        int sp = 0;
        int mid = 1;
        int ep = 2;
        int joi = 0;
        int ioi = 0;
        while (ep < input.length()) {
            if (input.charAt(mid) == 'O') {
              if (input.charAt(ep) == 'I') {
                  if (input.charAt(sp) == 'J') {
                      joi++;
                  }
                  else if (input.charAt(sp) == 'I') {
                      ioi++;
                  }
              }
            }
            sp++; mid++; ep++;
        }
        res.append(joi).append('\n').append(ioi);
        System.out.println(res);
    }
}
