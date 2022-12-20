package silver.silver1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Test1946 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            ArrayList<Applicant> list = new ArrayList<>();
            for (int j = 0; j < N; j++) {
                st = new StringTokenizer(br.readLine());
                Applicant applicant = new Applicant(Integer.parseInt(st.nextToken()),
                        Integer.parseInt(st.nextToken()));
                list.add(applicant);
            }
            Collections.sort(list, new Comparator<Applicant>() {
                @Override
                public int compare(Applicant o1, Applicant o2) {
                    if(o1.documentRank > o2.documentRank){
                        return 1;
                    } else {
                        return -1;
                    }
                }
            });
            int count = 1;
            int min = list.get(0).interviewRank;
            for (int j = 1; j < list.size(); j++) {
                if(list.get(j).interviewRank < min){
                    count++;
                    min = list.get(j).interviewRank;
                }
            }
            System.out.println(count);
        }
    }
    static class Applicant{
        int documentRank;
        int interviewRank;

        public Applicant(int documentRank, int interviewRank) {
            this.documentRank = documentRank;
            this.interviewRank = interviewRank;
        }
    }
}
