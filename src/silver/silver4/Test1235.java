package silver.silver4;

import java.io.*;
import java.util.ArrayList;

public class Test1235 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int k = 1;
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            list.add(br.readLine());
        }
        int i = 0;
        while (true) {
            if (list2.contains(list.get(i).substring(list.get(i).length() - k))) {
                k++;
                i = 0;
                list2.clear();
            } else {
                list2.add(list.get(i).substring(list.get(i).length() - k));
                i++;
            }
            if(list2.size()==list.size()){
                break;
            }
        }
        System.out.println(k);
    }
}
