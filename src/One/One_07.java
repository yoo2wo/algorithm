package One;

import java.util.Scanner;

public class One_07 {
    public String solution(String str){
        //1번 방식
//        String answer = "YES";
//        int len = str.length();
//        str = str.toUpperCase();
//        for(int i = 0; i < len/2 ; i++){
//            if (str.charAt(i) != str.charAt(len - i - 1))
//                return "NO";
//        }
//        return answer;
        //2번
        String temp = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(temp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        One_07 T = new One_07();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
