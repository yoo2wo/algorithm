package One;

import java.util.Scanner;

public class One_05 {

    public String solution(String str){
        char[] s = str.toCharArray();
        int len = str.length();
        int lt = 0, rt = len -1;

        while (lt < rt){
            if (!Character.isAlphabetic(s[lt]))
                lt++;
            else if (!Character.isAlphabetic(s[rt]))
                rt--;
            else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;
                lt++;
                rt--;
            }
        }
        return String.valueOf(s);
    }

    public static void main(String[] args) {
        One_05 T = new One_05();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(T.solution(str));
    }
}
