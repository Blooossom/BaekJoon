import java.io.BufferedReader;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Test1316 {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean[] test = new boolean[26];
        String str= "";
        String input = "";
        int count =N;
        for (int i = 0; i <N; i++) {
            str = br.readLine();
            input += str;


        for (int j = 0; j <str.length()-1; j++) {//문자열 길이만큼 반복
                if(str.charAt(j)!=str.charAt(j+1)){//검사랑 다음거랑 다르다면
                    if(test[str.charAt(j+1)-97]==true){//그리고 지금꺼가 true값이면
                        count--;//증가숫자 감소시키고
                        break;//브레이크함
                    }
                }else {
                    test[str.charAt(j+1)-97]=true;
                   //같으면 카운트 증가함
                }
        }
        }
        System.out.println(count);
        }
    }

