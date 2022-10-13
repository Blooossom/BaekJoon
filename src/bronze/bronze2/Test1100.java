package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test1100 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        for (int i = 0; i <8; i++) {
            String[] str = br.readLine().split("");
                if(i%2==0){
                    for (int j = 0; j <4; j++) {
                        if(str[2*j].equals("F")){
                            count++;
                        }
                    }
                }else if(i%2!=0){
                    for (int j = 0; j <4; j++) {
                        if(str[2*j+1].equals("F")){
                            count++;
                        }
                    }
                }
        }
        System.out.print(count);


    }
}
/*
for (int j = 0; j < 8; j++) {
                arr[i][j]=st.nextToken();
            }


int count = 0;
        for (int i = 0; i <8; i++) {
            if(i%2==0){
                for (int j = 0; j <4; j++) {
                    if(arr[i][2*j].equals("F")){
                        count++;
                    }
                }
            }else if(i%2!=0){
                for (int j = 0; j <4; j++) {
                    if(arr[i][2*j+1].equals("F")){
                        count++;
                    }
                }
            }
        }
        System.out.print(count);
 */
