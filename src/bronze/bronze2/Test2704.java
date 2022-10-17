package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test2704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            String[] arr = new String[3];
            st = new StringTokenizer(br.readLine(), ":");
            for (int j = 0; j < arr.length; j++) {
                arr[j] = Integer.toBinaryString(Integer.parseInt(st.nextToken()));
                int sub = 6 - arr[j].length();
                if (arr[j].length() < 6) {
                    arr[j] = "0".repeat(sub) + arr[j];
                }
            }
            String answer = "";
            for (int j = 0; j <arr[0].length(); j++) {
                answer += arr[0].charAt(j);
                answer += arr[1].charAt(j);
                answer += arr[2].charAt(j);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(answer).append("\t").append(arr[0]+arr[1]+arr[2]);
            System.out.print(sb);
            System.out.println();
        }
    }
}
/*

 */

/*
st = new StringTokenizer(br.readLine(),":");
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            String h = Integer.toBinaryString(H);
            String m = Integer.toBinaryString(M);
            String s = Integer.toBinaryString(S);
            if(h.length()<6){
                int sub = 6-h.length();
                for (int j = 0; j <sub; j++) {//6보다 작은 만큼
                    h = "0"+h;
                }
            }
            if(m.length()<6){
                int sub = 6-m.length();
                for (int j = 0; j <sub; j++) {
                    m="0"+m;
                }
            }
            if(s.length()<6){
                int sub = 6-s.length();
                for (int j = 0; j <sub; j++) {
                    s="0"+s;
                }
            }
            String answer = "";
            for (int j = 0; j <6; j++) {
                answer = answer + h.charAt(j);
                answer = answer + m.charAt(j);
                answer = answer + s.charAt(j);
            }
            System.out.print(answer+" ");
            System.out.print(h+m+s);
        }

 */