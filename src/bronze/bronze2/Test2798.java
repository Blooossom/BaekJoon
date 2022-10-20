package bronze.bronze2;
import java.io.*;
import java.util.StringTokenizer;

public class Test2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] card = new int[N];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <card.length; i++) {

            card[i]= Integer.parseInt(st.nextToken());
        }
        int sum = 0;
        int blackjack = 0;
        for (int i = 0; i <card.length; i++) {
            for (int j = 0; j <card.length; j++) {
                for (int k = 0; k <card.length; k++) {
                    if(i!=j&&j!=k&&i!=k){
                        sum=card[i]+card[j]+card[k];
                        if (sum <= M && sum > blackjack) {
                            blackjack=sum;
                        }
                    }
                }
            }
        }
        System.out.println(blackjack);
    }
}
