package bronze.bronze5;

import java.util.Scanner;
public class Test2744{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String result = "";
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if(ch>96&&ch<123){
                ch = (char)(ch-32);
            }else{
                ch = (char)(ch+32);
            }
            result += ch;
        }
        System.out.println(result);
    }
}
