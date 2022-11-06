import java.io.*;
import java.util.ArrayList;

public class Test5613 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list1=new ArrayList<>();
        ArrayList<String>list2 = new ArrayList<>();
        while(true){
            list1.add(Integer.parseInt(br.readLine()));
            String input = br.readLine();
            list2.add(input);
            if(input.equals("=")){
                break;
            }
        }
        for (int i = 0; i <list2.size()-1; i++) {
            calc(list1.get(i),list2.get(i),list1.get(i+1));

        }
    }
    public static int calc(int a, String input, int b){
        if (input.equals("+")) {
            return a+b;
        } else if (input.equals("-")) {
            return a-b;
        }else if(input.equals("*")){
            return a*b;
        } else{
            return a/b;
        }
    }
}
