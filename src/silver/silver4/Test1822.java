package silver.silver4;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Test1822 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());
        TreeSet<Integer> set = new TreeSet<>();
        int p;
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <nA; i++) {
            set.add(Integer.parseInt(st.nextToken()));
        }
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <nB; i++) {
            p= Integer.parseInt(st.nextToken());
            if(set.contains(p)){
                set.remove(p);
            }
        }
        System.out.println(set.size());
        for (int n :
                set) {
            System.out.println(n+" ");

        }
    }
}
/* 시간초과난 코드
int nA = Integer.parseInt(st.nextToken());
        int nB = Integer.parseInt(st.nextToken());
        ArrayList<Integer> aList = new ArrayList<>();
        ArrayList<Integer> bList = new ArrayList<>();
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <nA; i++) {
            aList.add(Integer.parseInt(st.nextToken()));
        }
        st= new StringTokenizer(br.readLine());
        for (int i = 0; i < nB; i++) {
            int check = Integer.parseInt(st.nextTokens();
            if(aList.contains(check){
            aList.remove(check);
        }
        if(aList.size()==0){
            System.out.println(0);
        }else{
            System.out.println(aList.size());
            for (int i = 0; i < aList.size(); i++) {
                System.out.print(aList.get(i)+" ");
            }
        }
 */
/* 메모리 초과
boolean[] arr = new boolean[2147483647];
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <nA; i++) {
            arr[Integer.parseInt(st.nextToken())]=true;
        }
        st=new StringTokenizer(br.readLine());
        for (int i = 0; i <nB; i++) {
            arr[Integer.parseInt(st.nextToken())]=false;
        }
        int count = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]){
                count++;
                sb.append(i).append(" ");
            }
        }
        System.out.println(count);
        System.out.print(sb.toString().trim());
 */
