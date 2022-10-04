package bronze.bronze5;

import java.util.Scanner;
public class Test4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.next();
        String answer = sc.next();

        if (input.length()>answer.length()||input.length()==answer.length()){
            System.out.println("go");
        }else{
        System.out.println("no");}
    }
}
