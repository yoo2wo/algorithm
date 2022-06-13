package One;

import java.util.Scanner;

public class One_03 {

    public String solution(String str){
        String answer ="";
        int max = Integer.MIN_VALUE, pos;
//        String[] s = str.split(" ");
//        for (String x : s){
//            int len = x.length();
//            if (max < len) {
//                max = len;
//                answer = x;
//            }
//        }
//        return answer;
        while((pos=str.indexOf(' ')) != -1){
            String temp = str.substring(0, pos);
            int len = temp.length();
            if (len > max){
                max = len;
                answer = temp;
            }
            str = str.substring(pos + 1);
        }
        if (str.length() > max ) answer=str;
        return answer;
    }

    public static void main(String[] args) {
        One_03 T= new One_03();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));

    }
}
