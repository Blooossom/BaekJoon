package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test2712 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());



        for (int i = 0; i <T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            double A = Double.parseDouble(st.nextToken());
            String input = st.nextToken();

            if(input.equals("kg")){
                System.out.println(String.format("%.4f",A*2.2046)+" lb");
            } else if (input.equals("l")) {
                System.out.println(String.format("%.4f",A*0.2642)+" g");
            }else if(input.equals("lb")){
                System.out.println(String.format("%.4f",A*0.4536)+" kg");
            }else if(input.equals("g")){
                System.out.println(String.format("%.4f",A*3.7854)+" l");
            }
        }
    }
}
