package gold.gold3;

import java.io.*;
import java.util.*;
public class Test7512_연속하는_소수의_합 {
        static int max = 1000;

    static boolean[] isPrime = new boolean[max];
    static List<Integer> primes = new ArrayList<>();
    //에라토스테네스의 체
    static void setPrimes() {
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;
        isPrime[2] = true;
        for (int i = 2; i < max; i++) {
            if (!isPrime[i]) continue;
            primes.add(i);
            for (int j = i * 2; j < max; j += i) {
                isPrime[j] = false;
            }
        }
    }

    //모든 sumArray가 같은 값을 가지고 있는 지 확인
    static boolean isCorrect(List<Integer> sumList, int val) {
        for(Integer x : sumList) {
            if(x != val) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        setPrimes(); //소수 초기화
        StringTokenizer st;
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            int m = Integer.parseInt(br.readLine());
            int[] nums = new int[m];
            List<Integer> sumList = new ArrayList<>();
            int[] sumSp = new int[m];
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                nums[j] = Integer.parseInt(st.nextToken());
            }
            for (int j = 0; j < m; j++) {
                int sum = 0;
                for(int k = 0; k < nums[j]; k++) {
                    sum += primes.get(k);
                }
                sumList.add(sum);
                while (!isPrime[sumList.get(j)]) {//구한 합이 소수인 지 체크
                    //소수가 아니라면 슬라이딩 윈도우 증가
                    sumList.set(j, sumList.get(j) + primes.get(sumSp[j] + nums[j]) - primes.get(sumSp[j]));
                    //슬라이딩 윈도우로 다음 값 더하고 맨 앞의 값 빼기
                    sumSp[j]++;//시작 인덱스 증가
                }
            }
            int answer = Integer.MIN_VALUE;
            for(int x : sumList) {
                answer = Math.max(answer, x);
            }

            while (!isCorrect(sumList, answer)) {
                for (int j = 0; j < m; j++) {
                    if (sumList.get(j) < answer) {
                        do {
                            sumList.set(j, sumList.get(j) + primes.get(sumSp[j] + nums[j]) - primes.get(sumSp[j]));
                            sumSp[j]++;
                        } while (!isPrime[sumList.get(j)]);
                    } else {
                        answer = sumList.get(j);
                        }
                    }

                }
                bw.write("Scenario ");
                bw.write(Integer.toString(i));
                bw.write(":");
                bw.write('\n');
                bw.write(Integer.toString(answer));
                bw.write('\n');
            }
        bw.flush();
        }
    }
