import java.io.*;
import java.util.StringTokenizer;

public class Test25206_너의평점은 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        double sum = 0.0;
        double sumForAvg = 0.0;
        for (int q = 0; q < 20; q++) {
            st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            if (grade.equals("P")){
                continue;
            }
            sum += score;
            sumForAvg += score * convertGrade(grade);
        }
        System.out.print(String.format("%.6f", sumForAvg/sum));
    }
    private static double convertGrade(String grade) {
        double res = 0.0;
        switch (grade) {
            case "A+" :
                res = 4.5;
                break;
            case "A0" :
                res = 4.0;
                break;
            case "B+" :
                res = 3.5;
                break;
            case "B0" :
                res = 3.0;
                break;
            case "C+" :
                res = 2.5;
                break;
            case "C0" :
                res = 2.0;
                break;
            case "D+" :
                res = 1.5;
                break;
            case "D0" :
                res = 1.0;
                break;
            case "F" :
                res = 0.0;
                break;
        }
        return res;
    }
}
