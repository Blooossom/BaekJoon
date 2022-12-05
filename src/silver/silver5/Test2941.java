package silver.silver5;

import java.io.*;
public class Test2941 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int count = 0;
        int len = str.length();
        for (int i = 0; i <str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'c' && i < len - 1) {
                if(str.charAt(i+1) =='-' || str.charAt(i+1) == '='){
                    i++;
                }
            } else if (ch == 'z' && i < len - 1) {
                if(str.charAt(i+1) =='='){
                    i++;
                }
            } else if (ch == 's' && i < len - 1) {
                if(str.charAt(i+1) =='='){
                    i++;
                }
            } else if (ch == 'l' && i < len - 1) {
                if(str.charAt(i+1) == 'j'){
                    i++;
                }
            } else if (ch == 'n' && i < len - 1) {
                if(str.charAt(i+1) == 'j'){
                    i++;
                }
            } else if (ch == 'd' && i < len - 1) {
                if(str.charAt(i+1) == '-'){
                    i++;
                }else if(i < len - 2 && str.charAt(i+1) == 'z' && str.charAt(i+2) == '='){
                    i=i+2;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
/*
if (i < str.length()-1 && ch == 'c') {
                if(str.charAt(i+1) == '-' || str.charAt(i+1) == '='){
                    i++;
                }
            } else if (i < str.length()-1 && ch == 'd') {
                if (str.charAt(i + 1) == '-') {
                    i++;
                } else if(i < str.length() - 2 && str.charAt(i+1) == 'z'){
                    if(str.charAt(i+2) == '='){
                        i += 2;
                    }else{
                        i++;
                    }
                }
            }else if (i < str.length()-1 && ch == 'z') {
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            }else if(i < str.length() - 1 && ch == 's'){
                if (str.charAt(i + 1) == '=') {
                    i++;
                }
            } else if (i < str.length() - 1 && ch == 'n' || ch == 'l') {
                if (str.charAt(i + 1) == 'j') {
                i++;
                }
            } else if (ch == '=' || ch == '-') {
                continue;
            }
            count++;
        }
 */
