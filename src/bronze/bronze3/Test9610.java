package bronze.bronze3;
import java.io.*;
import java.util.StringTokenizer;

public class Test9610 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int q1 =0;
        int q2 = 0;
        int q3 = 0;
        int q4 = 0;
        int axis = 0;
        for (int i = 0; i <T; i++) {
            st= new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y  = Integer.parseInt(st.nextToken());
            if(x==0||y==0){
                axis++;
            }else{
                if(x>0){
                    if(y>0){
                        q1++;
                    }else {
                        q4++;
                    }
                }else{
                    if(y>0){
                        q2++;
                    }else{
                        q3++;
                    }
                }
            }
        }
        System.out.println("Q1: "+q1);
        System.out.println("Q2: "+q2);
        System.out.println("Q3: "+q3);
        System.out.println("Q4: "+q4);
        System.out.println("AXIS: "+axis);

    }

}
