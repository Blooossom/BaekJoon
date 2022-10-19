package bronze.bronze4;
import java.io.*;
public class Test5543 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] bugger = new int[3];
        int[] drink = new int[2];
        for (int i = 0; i <3; i++) {
            bugger[i]= Integer.parseInt(br.readLine());
        }
        for (int i = 0; i <drink.length; i++) {
            drink[i]= Integer.parseInt(br.readLine());
        }
        int min=4000;
        for (int i = 0; i <bugger.length; i++) {
            for (int j = 0; j <drink.length; j++) {
                if(min>bugger[i]+drink[j]){
                    min=bugger[i]+drink[j];
                }
            }
        }
        System.out.print(min-50);
    }
}
