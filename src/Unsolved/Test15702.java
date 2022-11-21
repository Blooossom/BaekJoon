package Unsolved;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test15702 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        ArrayList<Integer> score = new ArrayList<>();
        for (int i = 0; i <N; i++) {
            score.add(Integer.parseInt(st.nextToken()));
        }
        ArrayList<Integer>  list = new ArrayList<>();
        ArrayList<Integer> student = new ArrayList<>();
        for (int i = 0; i <M; i++) {
            st=new StringTokenizer(br.readLine());
            int temp = Integer.parseInt(st.nextToken());
            list.add(temp);
            int sum = 0;
            for (int j = 0; j <N; j++) {
                if(st.nextToken().equals("O")){
                    sum+= score.get(j);
                }
            }
            student.add(sum);
        }
        int max = 0;
        int num = 0;
        for (int i = 0; i <student.size(); i++) {
            if(max<student.get(i)){
                max=student.get(i);
                num=list.get(i);
            }else if(max==student.get(i)){
                if(num>list.get(i)){
                    num=list.get(i);
                }
            }
        }
        System.out.println(num + " "+ max);
    }
    //53% 부근에서 틀렸습니다. 출력
}
