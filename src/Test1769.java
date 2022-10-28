import java.io.*;
public class Test1769 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        int count = 0;
        int sum;
        if(input.length()<10){
            System.out.println(0);
            if(Integer.parseInt(input)%3==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
        while(true) {
            sum = 0;
            for (int i = 0; i < input.length(); i++) {
                sum += Character.getNumericValue(input.charAt(i));
            }
            count++;
            if(sum<10){
                break;
            }
            input=Integer.toString(sum);
        }

        System.out.println(count);
        if(sum%3==0){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
