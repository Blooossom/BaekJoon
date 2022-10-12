package bronze.bronze2;
import java.io.*;
public class Test3062 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i <T; i++) {
            boolean answer = true;
            int input = Integer.parseInt(br.readLine());
            String reverse = Integer.toString(input);
            StringBuilder sb = new StringBuilder(reverse);
            int R = Integer.parseInt(sb.reverse().toString());
            int sum = input+R;
            String test = Integer.toString(sum);
            if(test.length()%2==0){
                for (int j = 0; j <test.length()/2; j++) {
                    if(test.charAt(j)!=test.charAt(test.length()-1-j)){
                        answer = false;
                    }else {answer = true;}
                }
            }else{
                for (int j = 0; j <test.length()/2; j++) {
                    if(test.charAt(j)!=test.charAt(test.length()-1-j)){
                        answer = false;
                    }
                }
            }
            if(answer==true){
                System.out.println("YES");
            }else{System.out.println("NO");}
        }
    }
}
