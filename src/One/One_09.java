package One;

import java.util.Scanner;

public class One_09 {
    public int solution(String str){
        int answer = 0 ;
        for (int i = 0; i < str.length(); i++){
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                answer = answer * 10 + (str.charAt(i) - '0');
        }
        return answer;
    }

    public static void main(String[] args) {
        One_09 T = new One_09();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
