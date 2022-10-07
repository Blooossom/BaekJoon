package bronze.bronze2;
import java.io.*;
public class Test3028 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        br.close();
        int[] ball = {1, 0, 0};

        for (int i = 0; i <input.length(); i++) {
            if(input.charAt(i)=='A'){
                if(ball[0]==1){
                    ball[0]=0;
                    ball[1]=1;
                }else if(ball[1]==1){
                    ball[0]=1;
                    ball[1]=0;
                }
            }else if(input.charAt(i)=='B'){
                if(ball[1]==1){
                    ball[1]=0;
                    ball[2]=1;
                }else if(ball[2]==1){
                    ball[1]=1;
                    ball[2]=0;
                }
            }else if (input.charAt(i)=='C'){
                if(ball[0]==1){
                    ball[0]=0;
                    ball[2]=1;
                }else if(ball[2]==1){
                    ball[0]=1;
                    ball[2]=0;
                }
            }
        }
        for (int j = 0; true; j++) {
            if(ball[j]==1){
                System.out.print(j+1);
                break;
            }
        }
    }
}
