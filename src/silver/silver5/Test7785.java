package silver.silver5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test7785 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        String[] name = new String[T];
        String[] stat = new String[T];
        HashMap<String, String> list = new HashMap<String, String>( );
        for (int i = 0; i < name.length; i++) {
            st=new StringTokenizer(br.readLine());
            name[i]=st.nextToken();
            stat[i]=st.nextToken();
            list.put(name[i],stat[i]);
        }
        ArrayList<String> arr = new ArrayList<>();
        for (String key:
             list.keySet()) {
            if(list.get(key).equals("enter")) {
                arr.add(key);
            }
        }
        Collections.sort(arr);
        for (int i = arr.size()-1; i >=0; i--) {
            System.out.println(arr.get(i));
        }
        
    }
}