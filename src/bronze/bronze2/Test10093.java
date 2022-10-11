package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;
import java.math.BigInteger;

public class Test10093 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//입력받음
        StringTokenizer st = new StringTokenizer(br.readLine());//자름

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        StringBuilder sb = new StringBuilder();
        if(A>B){
            sb.append(A-B-1).append("\n");
            for (long i = B+1; i <A; i++) {
                sb.append(i).append(" ");
            }
        }else if(A<B){
            sb.append(B-A-1).append("\n");
            for (long i = A+1; i <B; i++) {
                sb.append(i).append(" ");
            }
        }else{
            sb.append(0);
        }
        System.out.print(sb);
    }
}
//BigInteger A = new BigInteger(st.nextToken());
//        BigInteger B = new BigInteger(st.nextToken());
//        System.out.println((int)Math.abs(Integer.parseInt((B.subtract(A)).toString()))-1);
//        if((int)Math.abs((Integer.parseInt((B.subtract(A)).toString()) - 1))==0){
//            return;
//        }
//        if (Integer.parseInt(A.toString()) < Integer.parseInt(B.toString())) {
//            for (int i = Integer.parseInt(A.toString()) + 1; i < Integer.parseInt(B.toString()); i++) {
//                System.out.print(i + " ");
//            }
//        } else if(Integer.parseInt(A.toString())>Integer.parseInt(B.toString())){
//            for (int i = Integer.parseInt(B.toString()) + 1; i < Integer.parseInt(A.toString()); i++) {
//                System.out.print(i + " ");
//            }
//        }
