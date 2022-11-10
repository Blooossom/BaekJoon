package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test9625 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int K = Integer.parseInt(br.readLine());
        int A = 1;
        int B = 0;
        int tmp = 0;
        for (int i = 0; i <K; i++) {
            tmp=A;
            A=B;
            B=tmp+B;
        }
        System.out.println(A+" "+B);
    }
}
/* ArrayList 메모리초과 뜸
ArrayList<String> list = new ArrayList<>();
        list.add("A");
        for (int i = 0; i <K; i++) {
            for (int j = 0; j <list.size(); j++) {
                if(list.get(j).equals("A")){
                    list.set(j,"B");
                }else{
                    list.add(j+1,"A");
                    j++;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <list.size(); i++) {
            sb.append(list.get(i));
        }
        int A = 0;
        int B = 0;
        for (int i = 0; i <sb.toString().length(); i++) {
            if(sb.toString().charAt(i)=='A'){
                A++;
            }else{
                B++;
            }
        }
        System.out.println(A+" "+B);
 */
/* StringBuilder 메모리 초과
StringBuilder sb = new StringBuilder(input);
        for (int i = 0; i <K; i++) {
            for (int j = 0; j <sb.toString().length(); j++) {
                if(sb.toString().charAt(j)=='A'){
                    sb.setCharAt(j,'B');
                }else{
                    sb.insert(j+1,"A");
                    j++;
                }
            }
        }
        int A = 0;
        int B = 0;
        for (int i = 0; i <sb.toString().length(); i++) {
            if (sb.toString().charAt(i)=='A'){
                A++;
            }else{
                B++;
            }
        }
        System.out.println(A+" "+B);
 */
