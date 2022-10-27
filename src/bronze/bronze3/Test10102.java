package bronze.bronze3;
import java.io.*;
public class Test10102 {
    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int V = Integer.parseInt(br.readLine());
        String input = br.readLine();
        int count = 0;
        for (int i = 0; i <V; i++) {
            char ch = input.charAt(i);
            if(ch=='A'){
                count++;
            }else if(ch=='B'){
                count--;
            }
        }
        if(count>0){
            System.out.println("A");
        }else if (count<0){
            System.out.println("B");
        }else{
            System.out.println("Tie");
        }
    }
}
