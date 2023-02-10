package silver.silver4;

import java.io.*;
import java.util.ArrayList;

public class Test1439 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] zeroArr = str.split("1");
        String[] oneArr = str.split("0");

        ArrayList<String> zeroList = new ArrayList<>();
        ArrayList<String> oneList = new ArrayList<>();

        for (String s : zeroArr) {
            if (!s.equals("")) {
                zeroList.add(s);
            }
        }
        System.out.println(zeroList);
        for (String s : oneArr) {
            if (!s.equals("")) {
                oneList.add(s);
            }
        }
        System.out.println(Math.min(zeroList.size(), oneList.size()));
    }
}
