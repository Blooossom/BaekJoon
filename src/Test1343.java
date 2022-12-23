import java.io.*;
import java.util.ArrayList;

public class Test1343 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String tar = br.readLine();
        String A = "AAAA";
        String B = "BB";
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < tar.length(); i++) {
            list.add(tar.substring(i,i+1));
        }
        System.out.println(list);
        ArrayList<String> res = new ArrayList<>();
        int i = 1;
        String temp = "";
        while(true){
            if (list.isEmpty()) {
                break;
            }
            if (!list.get(i).equals(list.get(0))){
                temp = temp + list.get(0);
                res.add(temp);
                list.remove(0);
                if(list.size() == 1){
                    temp = list.get(0);
                    res.add(temp);
                    list.remove(0);
                }
            } else {
                if (list.size() == 2) {
                    temp = temp + list.get(1);
                }
                temp = temp + list.get(0);
                list.remove(1);
                list.remove(0);
            }
        }
        System.out.println(res);
        System.out.println(list);
    }
}
