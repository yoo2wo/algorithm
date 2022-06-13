package One;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class One_02 {
    public String solution (String str){
        String answer = "";
        for(char x : str.toCharArray()){
            if (Character.isLowerCase(x)) answer += Character.toUpperCase(x);
            else answer += Character.toLowerCase(x);
        }
//        char[] array = str.toCharArray();
//        for(int i = 0; i < array.length; i++){
//            if (array[i] >= 'A' && array[i] <= 'Z'){
//                answer += Character.toLowerCase(array[i]);
//            } else if (array[i] >= 'a' && array[i] <= 'z'){
//                answer += Character.toUpperCase(array[i]);
//            }
//        }
        return answer;
    }

    public static void main(String[] args) {
        One_02 T = new One_02();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
