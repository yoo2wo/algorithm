package One;

import java.util.Scanner;

public class One_08 {
    public String solution(String str){
        String answer ="";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");
        String temp = new StringBuilder(str).reverse().toString();
        System.out.println(str);
        if (str.equals(temp)) return "YES";
        return "NO";
    }

    public static void main(String[] args) {
        One_08 T = new One_08();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
