package bronze.bronze4;
import java.io.*;
import java.sql.SQLOutput;
import java.util.StringTokenizer;

public class Test25591 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int a = 100-X;
        int b = 100-Y;
        int c = 100-(a+b);
        int c1=c;
        int d = a*b;
        int d1 = d;
        int q = d/100;
        int r = d%100;
        if(d>=100){
            c1=c+q;
            d1=r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a).append("\s")
                .append(b).append("\s")
                .append(c).append("\s")
                .append(d).append("\s")
                .append(q).append("\s")
                .append(r).append("\n")
                .append(c1).append("\s")
                .append(d1);
        System.out.print(sb);
    }
}
