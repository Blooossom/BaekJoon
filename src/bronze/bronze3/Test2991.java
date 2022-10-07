package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test2991 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        int D = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int arrive;

        for (int j = 0; j <3; j++) {
        arrive = Integer.parseInt(st.nextToken());
        int dog = 0;
        for (int i = 0; ; i++) {
            if(i*(A+B)+A>=arrive && arrive>i*(A+B)){
                dog++;
                break;
            }else if(i*(A+B)-B<arrive && arrive<=i*(A+B)){
                break;
            }
        }
            for (int i = 0; ; i++) {
                if(i*(C+D)+C>=arrive && arrive>i*(C+D)){
                    dog++;
                    System.out.println(dog);
                    break;
                }else if(i*(C+D)-D<arrive && arrive<=i*(C+D)){
                    System.out.println(dog);
                    break;
                }
            }
        }
    }
}
