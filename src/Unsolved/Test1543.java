package Unsolved;

import java.io.*;
public class Test1543 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String doc = br.readLine();
        String search = br.readLine();
        if(search.length() > doc.length()) {
            System.out.println(0);
            return;
        } else if (search.length() == doc.length()) {
            if (search.equals(doc)) {
                System.out.println(1);
                return;
            }
            else {
                System.out.println(0);
                return;
            }
        } else {
            int count = 0;
            for (int i = 0; i < doc.length();) {
                if (i + search.length() > doc.length()) {
                    break;
                }
                if (search.equals(doc.substring(i, i + search.length()))) {
                    count++;
                    i = i + search.length();
                }
            }
            System.out.println(count);
        }
    }
}
