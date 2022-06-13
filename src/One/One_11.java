package One;

import java.util.Scanner;

public class One_11 {

    public String solution (String s){
        String answer = "";
        s=s+" ";
        int count = 1;

        for(int i = 0; i < s.length()-1; i++){
            if (s.charAt(i) == s.charAt(i+1)){
                count++;
            } else {
                answer+=s.charAt(i);
                if (count > 1)
                    answer+=count;
                count = 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        One_11 T = new One_11();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
