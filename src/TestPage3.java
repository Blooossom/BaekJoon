import java.util.*;

public class TestPage3 {
    static final int mod = 1_000_000_007;
    static int n, m, k;
    static int[][] graph;
    static int[][] matrix;
    static int[][] result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        k = sc.nextInt();

        graph = new int[n + 1][n + 1];
        matrix = new int[n + 1][n + 1];
        result = new int[n + 1][n + 1];

        for (int i = 1; i <= n; i++) {
            result[i][i] = 1;
        }

        for (int i = 0; i < m; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph[u][v] = graph[v][u] = 1;
        }

        matrix = graph;
        k--;
        while (k > 0) {
            if ((k & 1) == 1) {
                result = multiply(result, matrix);
            }
            matrix = multiply(matrix, matrix);
            k >>= 1;
        }

        int ans = 0;
        for (int i = 1; i <= n; i++) {
            ans = (ans + result[i][i]) % mod;
        }
        System.out.println(ans);
    }

    static int[][] multiply(int[][] a, int[][] b) {
        int[][] c = new int[n + 1][n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k <= n; k++) {
                    c[i][j] = (c[i][j] + a[i][k] * b[k][j]) % mod;
                }
            }
        }
        return c;
    }
}
