import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
public class Test16935_배열돌리기3 {
    private static int[][] baseArr;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        baseArr = new int[N][M];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                baseArr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        int[][] answer = baseArr.clone();
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < R; i++) {
            int command = Integer.parseInt(st.nextToken());
           answer = classify(command, answer);
        }
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                sb.append(answer[i][j]).append(" ");
            }
            sb.append('\n');
        }
        System.out.println(sb.toString().trim());
    }
    private static int[][] classify(int command, int[][] arr) {
        switch (command) {
            case 1:
                return commandOne(arr);
            case 2:
                return commandTwo(arr);
            case 3:
                return commandThree(arr);
            case 4:
                return commandFour(arr);
            case 5:
                return commandFive(arr);
            case 6:
                return commandSix(arr);
            default:
                return null;
        }
    }
    private static int[][] commandOne(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            res[i] = arr[arr.length - 1 - i];
        }
        return res;
    }
    private static int[][] commandTwo(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                res[i][j] = arr[i][arr[0].length - 1 - j];
            }
        }
        return res;
    }
    private static int[][] commandThree(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = arr[arr.length - 1 - j][i];
            }
        }
        return res;
    }
    private static int[][] commandFour(int[][] arr) {
        int[][] res = new int[arr[0].length][arr.length];
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                res[i][j] = arr[j][arr[0].length - 1 - i];
            }
        }
        return res;
    }
    private static int[][] commandFive(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        int[][] sub1 = new int[res.length / 2][res[0].length / 2];
        int[][] sub2 = new int[res.length / 2][res[0].length / 2];
        int[][] sub3 = new int[res.length / 2][res[0].length / 2];
        int[][] sub4 = new int[res.length / 2][res[0].length / 2];

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                sub1[i][j] = arr[i][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                sub2[i - arr.length / 2][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                sub3[i][j - arr[0].length / 2] = arr[i][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                sub4[i - arr.length / 2][j - arr[0].length / 2] = arr[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i < res.length / 2) {
                    if (j < res[0].length / 2) {
                        res[i][j] = sub2[i][j];
                    }
                    else {
                        res[i][j] = sub1[i][j - arr[0].length / 2];
                    }
                }
                else {
                    if (j < res[0].length / 2) {
                        res[i][j] = sub4[i - arr.length / 2][j];
                    }
                    else {
                        res[i][j] = sub3[i - arr.length / 2][j - arr[0].length / 2];
                    }
                }
            }
        }
        return res;
    }
    private static int[][] commandSix(int[][] arr) {
        int[][] res = new int[arr.length][arr[0].length];
        int[][] sub1 = new int[res.length / 2][res[0].length / 2];
        int[][] sub2 = new int[res.length / 2][res[0].length / 2];
        int[][] sub3 = new int[res.length / 2][res[0].length / 2];
        int[][] sub4 = new int[res.length / 2][res[0].length / 2];

        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                sub1[i][j] = arr[i][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length / 2; j++) {
                sub3[i - arr.length / 2][j] = arr[i][j];
            }
        }
        for (int i = 0; i < arr.length / 2; i++) {
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                sub2[i][j - arr[0].length / 2] = arr[i][j];
            }
        }
        for (int i = arr.length / 2; i < arr.length; i++) {
            for (int j = arr[0].length / 2; j < arr[0].length; j++) {
                sub4[i - arr.length / 2][j - arr[0].length / 2] = arr[i][j];
            }
        }
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                if (i < res.length / 2) {
                    if (j < res[0].length / 2) {
                        res[i][j] = sub2[i][j];
                    }
                    else {
                        res[i][j] = sub4[i][j - arr[0].length / 2];
                    }
                }
                else {
                    if (j < res[0].length / 2) {
                        res[i][j] = sub1[i - arr.length / 2][j];
                    }
                    else {
                        res[i][j] = sub3[i - arr.length / 2][j - arr[0].length / 2];
                    }
                }
            }
        }
        return res;
    }

}
