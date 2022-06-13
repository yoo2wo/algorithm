package One;

import java.util.Arrays;
import java.util.Scanner;

public class One_10 {

    public int[] solution (String str, char c){
        int[] answer = new int[str.length()];
        char[] s = str.toCharArray();
        int p = 1000;

        for(int i = 0; i < str.length(); i++){
            if (s[i] == c){
                p = 0;
            }
            answer[i] = p;
            p++;
        }

        p = 1000;
        for(int i= str.length() - 1; i >= 0; i--){
            if (s[i] == c){
                p = 0;
            }
            if (answer[i] > p){
                answer[i] = p;
            }
            p++;
        }
        return answer;
    }

    public static void main(String[] args) {
        One_10 T = new One_10();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        char c = kb.next().charAt(0);
        for(int x:T.solution(s, c)){
            System.out.print(x+" ");
        }
    }
}
