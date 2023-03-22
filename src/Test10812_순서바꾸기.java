import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Test10812_순서바꾸기 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int sp = Integer.parseInt(st.nextToken());
            int ep = Integer.parseInt(st.nextToken());
            int mid = Integer.parseInt(st.nextToken());
            int[] preArr = new int[mid - sp];
            int[] postArr = new int[ep - mid + 1];
            ArrayList<Integer> list = new ArrayList<>();
            for (int j = 0; j < sp - 1; j++) {
                list.add(arr[j]);
            }
            for (int j = sp - 1; j < mid - 1; j++) {
                preArr[j - (sp - 1)] = arr[j];
            }
            for (int j = mid; j <= ep; j++) {
                postArr[j - mid] = arr[j - 1];
            }

            for (int j = 0; j < postArr.length; j++) {
                list.add(postArr[j]);
            }
            for (int j = 0; j < preArr.length; j++) {
                list.add(preArr[j]);
            }
            for (int j = ep; j < arr.length; j++) {
                list.add(arr[j]);
            }
            for (int j = 0; j < list.size(); j++) {
                arr[j] = list.get(j);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int param:arr) {
            sb.append(param).append(' ');
        }
        System.out.println(sb.toString().trim());
    }
}
