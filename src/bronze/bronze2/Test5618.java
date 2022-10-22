package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test5618 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        if(N==2){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            cd1(a,b);
        }else if(N==3){
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            cd2(a,b,c);
        }
    }
    public static void cd1(int x, int y){
        int r = 0;
        int range = 0;
     while(true){
         r=x%y;
         if(r==0){
             range = y;
             break;
         }
         x=y;
         y=r;
     }
        for (int i = 0; i <range; i++) {
            if(x%(i+1)==0&&y%(i+1)==0){
                System.out.println(i+1);
            }
        }
    }
    public static void cd2(int x, int y, int z){
        int r = 0;
        int range = 0;
        while(true){
            r=x%y%z;
            if(r==0){
                range = z;
                break;
            }
            x=y;
            y=z;
            z=r;
        }
        for (int i = 0; i <range; i++) {
            if(x%(i+1)==0&&y%(i+1)==0&&z%(i+1)==0){
                System.out.println(i+1);
            }
        }
    }

}
