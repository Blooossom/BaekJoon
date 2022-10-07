package bronze.bronze3;
import java.io.*;
public class Test2857 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] agent = new String[5];
        for (int i = 0; i < agent.length; i++) {
            agent[i]=br.readLine();
        }
        StringBuilder sb = new StringBuilder();
        int count =0;
        for (int j = 0; j < agent.length; j++) {
            if(agent[j].contains("FBI")){
                count++;
                sb.append(j+1).append(" ");
            }
        }
        if(count==0) {
            System.out.println("HE GOT AWAY!");
        }else System.out.print(sb);
    }
}

