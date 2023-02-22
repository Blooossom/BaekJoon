import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Test3758_KCPC {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        HashMap<Integer, HashMap<Integer, Integer>> map;
        HashMap<Integer, Integer> questionScore;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            ArrayList<Rank> list = new ArrayList<>();
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int t = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int[] submitCount = new int[n + 1];
            int[] lastSubmit = new int[n + 1];
            map = new HashMap<>();
            questionScore = new HashMap<>();
            for (int j = 0; j < m; j++) {
                st = new StringTokenizer(br.readLine());
                int id = Integer.parseInt(st.nextToken());
                int question = Integer.parseInt(st.nextToken());
                int score = Integer.parseInt(st.nextToken());
                lastSubmit[id] = j + 1;
                submitCount[id]++;
                if (map.containsKey(id)) {
                    if (questionScore.containsKey(question)) {
                        questionScore.put(question, Math.max(questionScore.get(question), score));
                    }
                    else {
                        questionScore.put(question, score);
                        map.put(id, questionScore);
                    }
                }
                else {
                    questionScore.put(question, score);
                    map.put(id, questionScore);
                }
            }
            System.out.println(map);
            for (Integer teamId:map.keySet()) {
                int sum = 0;
                for (Integer key:questionScore.keySet()) {
                    sum += questionScore.get(key);
                }
                list.add(new Rank(teamId, sum, submitCount[teamId], lastSubmit[teamId]));
            }
            list.sort((o1, o2) -> {
                if (o1.score > o2.score) {
                    return -1;
                }
                else if (o1.score == o2.score) {
                    if (o1.count > o2.count) {
                        return 1;
                    }
                    else if (o1.count == o2.count) {
                        return o1.lastSubmit - o2.lastSubmit;
                    }
                    else {
                        return -1;
                    }
                }
                else {
                    return 1;
                }
            });
            System.out.println(list);
            for (int j = 0; j < list.size(); j++) {
                if (list.get(i).id == t) {
                    System.out.println(j + 1);
                    break;
                }
            }
        }
    }
    static class Rank {
        int id;
        int score;
        int count;
        int lastSubmit;

        public Rank(int id, int score, int count, int lastSubmit) {
            this.id = id;
            this.score = score;
            this.count = count;
            this.lastSubmit = lastSubmit;
        }

        @Override
        public String toString() {
            return "Rank{" +
                    "id=" + id +
                    ", score=" + score +
                    ", count=" + count +
                    ", lastSubmit=" + lastSubmit +
                    '}';
        }
    }
}
