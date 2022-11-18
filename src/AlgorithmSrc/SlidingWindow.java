package AlgorithmSrc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class SlidingWindow {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        Deque<Integer> list = new ArrayDeque<>();
        st=new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[N];
        for (int i = 0; i <arr.length; i++) {
            arr[i]= Integer.parseInt(st.nextToken());
        }
        StringBuilder sb= new StringBuilder();
        for (int i = 0; i <N; i++) {
            while (!list.isEmpty() && list.peekFirst() <= i - L) {
                list.pollFirst();
            }
            while(!list.isEmpty()&&arr[list.peekLast()]>arr[i]){
                list.pollLast();
            }
            list.add(i);
            sb.append(arr[list.peekFirst()]);
            sb.append(' ');
        }
        System.out.println(sb.toString());
    }
}
