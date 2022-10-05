package bronze.bronze2;
import java.util.Scanner;
public class Test2292 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N =sc.nextInt();
        int count=1;
        int answer=2;

        if(N==1){
            System.out.println(1);}
        else{
            while(answer<=N){
                answer=answer+(6*count);
                count++;
            }
            System.out.println(count);
        }

        }
    }

//System.out.println(arr[0]);
//        System.out.println(arr[1]);
//        System.out.println(arr[2]);
//        System.out.println(arr[3]);
//        System.out.println(arr[4]);
//        System.out.println(arr[5]);
