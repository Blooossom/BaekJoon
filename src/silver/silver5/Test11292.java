package silver.silver5;

import java.io.*;
import java.util.*;

public class Test11292 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        while (true) {
            int T = Integer.parseInt(br.readLine());
            StringBuilder sb = new StringBuilder();
            if(T==0){
                break;
            }
            List<Order> list = new LinkedList<>();
            for (int i = 0; i <T; i++) {
                st=new StringTokenizer(br.readLine()," ");
                String str =st.nextToken();
                float f = Float.parseFloat(st.nextToken());
                Order order = new Order(str,f);
                list.add(order);
            }
            Collections.sort(list, new Comparator<Order>() {
                @Override
                public int compare(Order o1, Order o2) {
                    if (o1.height > o2.height) {
                        return -1;
                    } else if (o1.height == o2.height) {
                        return 0;
                    }else {
                        return 1;
                    }
                }
            });
            float temp = list.get(0).height;
            for (int i = 0; i <list.size(); i++) {
                if(list.get(i).height==temp){
                    sb.append(list.get(i).name).append(" ");
                }
            }
            System.out.println(sb.toString().trim());
        }
    }
    static class Order{
        String name;
        float height;

        public Order(String name, float height) {
            this.name = name;
            this.height = height;
        }
    }
}