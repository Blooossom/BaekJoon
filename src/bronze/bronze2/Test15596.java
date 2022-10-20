package bronze.bronze2;

public class Test15596 {
    public long sum(int[] a){
        long answer = 0;
        for (int i = 0; i <a.length; i++) {
            answer += a[i];
        }
        return answer;
    }
}
