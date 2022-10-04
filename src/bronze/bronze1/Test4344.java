package bronze.bronze1;

import java.io.*;
import java.util.StringTokenizer;

public class Test4344 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());//테스트 케이스 입력받고
        double[] answer = new double[C]; // 퍼센트 모아둔 배열
        for(int i=0; i<C; i++){ //5받으면
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N= Integer.parseInt(st.nextToken()); //학생 수
            int[] score = new int[N]; //점수 모아둘 배열
            int sum =0; //점수 평균계산을 위한 합계
            int count=0; //평균 넘는 학생 수를 계산하기 위한 count
            double avg = 0; //평균 계산할 때 씀.
            for(int k=0; k<N; k++){//합계만 계산하는 for문
                score[k]= Integer.parseInt(st.nextToken()); //첫 케이스의 점수를 입력 받음
                sum += score[k]; // 점수 합계 > 1회차 350
                }avg = (double)sum/N; //350/5 > 70나옴
            for(int j=0; j<N; j++){
                if(score[j]>avg){//한명씩 순차적으로 70보다 큰지 계산
                    count++;    //평균보다 크면 count 증가함
                }
            }answer[i]=((double)count/N)*100;
        }
        for (int i = 0; i <C; i++) {
            System.out.println(String.format("%.3f", answer[i])+"%");
        }
    }
}
