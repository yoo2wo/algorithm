package Four;

import java.util.HashMap;
import java.util.Scanner;

public class Four_2 {

    public String solution (String s1, String s2){
        String answer = "NO";

        HashMap<Character, Integer> map = new HashMap<>();

        for(char x : s1.toCharArray()){
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        for(char c : s2.toCharArray()){
            if (map.getOrDefault(c, 0) <= 0)
                return answer;
            else
                map.put(c, map.get(c) - 1);
        }
        return "YES";
    }

    public static void main(String[] args) {
        Four_2 T = new Four_2();
        Scanner kb = new Scanner(System.in);
        String s1 = kb.next();
        String s2 = kb.next();
        System.out.println(T.solution(s1, s2));
    }

}
