package silver.silver5;

import java.io.*;
import java.util.*;

public class Test25325 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        ArrayList<String> student = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < T; i++) {
            student.add(st.nextToken());
        }
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int count = st.countTokens();
            for (int j = 0; j < count; j++) {
                list.add(st.nextToken());
            }
        }
        ArrayList<Popularity> popularities = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            Popularity popularity = new Popularity(student.get(i), Collections.frequency(list, student.get(i)));
            popularities.add(popularity);
        }
        Collections.sort(popularities, new Comparator<Popularity>() {
            @Override
            public int compare(Popularity o1, Popularity o2) {
                if(o1.popular > o2.popular){
                    return -1;
                }else if(o1.popular == o2.popular){
                    return o1.number.compareTo(o2.number);
                }else{
                    return 1;
                }
            }
        });
        for (int i = 0; i < popularities.size(); i++) {
            System.out.println(popularities.get(i));
        }
    }
    static class Popularity{
        String number;
        int popular;

        public Popularity(String number, int popular) {
            this.number = number;
            this.popular = popular;
        }

        public Popularity() {
        }

        @Override
        public String toString() {
            return number + ' ' + popular;
        }
    }
}
