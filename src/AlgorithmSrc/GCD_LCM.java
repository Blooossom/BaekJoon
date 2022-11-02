package AlgorithmSrc;

public class GCD_LCM {
    public static void main(String[] args) {
        System.out.println(gcd(10,12));
        System.out.println(lcm(10,12));
    }
    public static int gcd(int p, int q){
        if (q == 0) {
            return p;
        }else{
            return gcd(q,p%q);
        }
    }
    public static int lcm(int a, int b){
        return a*b/gcd(a,b);
    }
}
