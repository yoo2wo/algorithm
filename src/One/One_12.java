package One;

import java.util.Scanner;

public class One_12 {

    public String solution(int n, String s){
        String answer = "";

        s = s.replace("#", "1");
        s = s.replace("*", "0");
        char[] arr = new char[n];
        for(int i = 0; i < n; i++){
                arr[i] = (char)Integer.parseInt(s.substring(i*7 + 0, i*7 + 7),2);
        }
        return String.valueOf(arr);
    }


    public static void main(String[] args) {
        One_12 T = new One_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String s = kb.next();
        System.out.println(T.solution(n, s));
    }
}
