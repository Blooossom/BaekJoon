package bronze.bronze2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Test13771_Presents {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<Double> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            double input = Double.parseDouble(br.readLine());
            list.add(input);
        }
        Collections.sort(list);
        System.out.println(String.format("%.2f", list.get(1)));
    }
}
