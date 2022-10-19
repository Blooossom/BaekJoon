package bronze.bronze5;
import java.io.*;
import java.util.StringTokenizer;

public class Test24736 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] tScore = new int[2];
        int[] fScore = new int[2];
        int[] sScore = new int[2];
        int[] pScore = new int[2];
        int[] cScore = new int[2];
        int[] result = new int[2];
        for (int i = 0; i <2; i++) {
            st= new StringTokenizer(br.readLine());
            tScore[i]= 6*Integer.parseInt(st.nextToken());
            fScore[i]= 3*Integer.parseInt(st.nextToken());
            sScore[i]= 2*Integer.parseInt(st.nextToken());
            pScore[i]= Integer.parseInt(st.nextToken());
            cScore[i]= 2*Integer.parseInt(st.nextToken());
            result[i]=tScore[i]+fScore[i]+sScore[i]+pScore[i]+cScore[i];
        }
        System.out.println(result[0] + " "+result[1]);
    }
}
