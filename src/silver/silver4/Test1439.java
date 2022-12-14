package silver.silver4;

import java.io.*;
import java.util.ArrayList;

public class Test1439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("1");
        String[] arr1 = str.split("0");
        ArrayList<String> list = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                list.add(arr[i]);
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            if(!arr1[i].equals("")){
                list1.add(arr1[i]);
            }
        }
        System.out.println(Math.min(list.size(), list1.size()));
    }
}
