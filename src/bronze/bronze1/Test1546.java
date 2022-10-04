package bronze.bronze1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
public class Test1546{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[N];
        for (int i = 0; i <N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int max=-1;
        for(int k=0; k<N; k++){
            if(arr[k]>max){
                max = arr[k];
            }
        }
        double[] result = new double[N];
        double sum=0;
        for(int j=0; j<N; j++){
            result[j]=(arr[j]/(double)max)*100;
            sum+=result[j];
        }
        double avg = sum/N;

        System.out.println(avg);
    }}