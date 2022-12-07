import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Test10828 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Integer> list = new ArrayList<>();
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
           st = new StringTokenizer(br.readLine());
           if(st.countTokens()>1){
               String str = st.nextToken();
               int p = Integer.parseInt(st.nextToken());
               push(list,p);
           } else {
               path(st.nextToken(), list);
           }
        }
    }
    static void path(String str, ArrayList<Integer> list){
        switch(str){
            case "top":
                System.out.println(top(list));
                break;
            case "size":
                System.out.println(size(list));
                break;
            case "empty":
                System.out.println(empty(list));
                break;
            case "pop":
                System.out.println(pop(list));
                break;
        }
    }
    static ArrayList<Integer> push(ArrayList<Integer> list, int p){
        list.add(p);
        return list;
    }
    static int pop(ArrayList<Integer> list){
        if (list.isEmpty()) {
            return -1;
        }else{
            if (list.size() > 2) {
                int temp = list.get(list.size() - 1);
                list.remove(list.size() - 1);
                return temp;
            } else {
                int temp = list.get(0);
                list.remove(0);
                return temp;
            }
        }
    }
    static int size(ArrayList<Integer> list){
        return list.size();
    }
    static int empty(ArrayList<Integer> list){
        return list.isEmpty()? 1:0;
    }
    static int top(ArrayList<Integer> list){
        return list.get(list.size()-1);
    }


}
