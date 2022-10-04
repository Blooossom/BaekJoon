import java.io.*;
public class Test2442 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i <N; i++) {
            for (int j = N-1; j >i; j--) {
                bw.write(" ");
            }
            for (int k = 0; k <2*(i+1)-1; k++) {
                bw.write("*");
            }
            bw.write("\n");
        }bw.close();
    }
    
}
