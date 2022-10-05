package bronze.bronze3;
import java.util.Scanner;
public class Test4153 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A;
        int B;
        int C;

        while(true){
            A=sc.nextInt();
            B=sc.nextInt();
            C=sc.nextInt();
            if(A==0&&B==0&&C==0){break;}
            int sqA = (int)Math.pow(A,2);
            int sqB = (int)Math.pow(B,2);
            int sqC = (int)Math.pow(C,2);
            if(sqA+sqB==sqC||sqA+sqC==sqB||sqB+sqC==sqA){
                System.out.println("right");
            }else System.out.println("wrong");
        }
    }
}
