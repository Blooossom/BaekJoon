import java.io.*;
public class Test2441 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N; i++) {
            for (int j = 0; j<i; j++) {
                bw.write(" ");
            }
            for (int k = N; k >i; k--) {
                bw.write("*");
            }
            bw.write("\n");

        }bw.close();

    }
}
