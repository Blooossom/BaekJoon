package silver.silver5;
import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class Test15904 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i < input.length(); i++) {
            String token = input.substring(i, i+1);
            if(input.charAt(i) > 64 && input.charAt(i) < 91){
                queue.offer(token);
            }
        }
        String res = "";
        if (queue.size() == 4){
            while(!queue.isEmpty()){
                res = res + queue.poll();
            }
        } else {
            String[] arr = {"U", "C", "P", "C"};
            for (int i = 0; i < arr.length; i++) {
                while (true) {
                    String temp = queue.poll();
                    if (arr[i].equals(temp)) {
                        res = res + temp;
                        break;
                    }
                    if (queue.isEmpty()) {
                        break;
                    }
                }
            }
        }
        if (res.equals("UCPC")) {
            System.out.println("I love UCPC");
        } else {

        System.out.println("I hate UCPC");
        }
    }
}
