package bronze.bronze4;
import java.io.*;
import java.util.StringTokenizer;
public class Test16199 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] birth = new int[3];
        int[] input = new int[3];
        for (int i = 0; i <birth.length; i++) {
            birth[i]= Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <input.length; i++) {
            input[i]= Integer.parseInt(st.nextToken());
        }
        int A=0;
        int B=input[0]-birth[0]+1;
        int C=input[0]-birth[0];
        if(input[0]>birth[0]){
            if(input[1]>birth[1]){
                A = input[0]-birth[0];
            }else if(input[1]==birth[1]){
                if(input[2]>=birth[2]){
                    A = input[0]-birth[0];
                }else{
                    A = input[0]-birth[0]-1;
                }
            }else{
                A = input[0]-birth[0]-1;
            }
        }else if(input[0]==birth[0]){
            A=0;
        }else{
            return;
        }
        br.close();
        StringBuilder sb = new StringBuilder();
        sb.append(A).append("\n").append(B).append("\n").append(C);
        System.out.println(sb);
    }
}
