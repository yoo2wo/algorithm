package Four;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Four_4 {
//    public int solution (String s, String t){
//        int answer = 0;
//        int lt = 0;
//
//        HashMap<Character, Integer> map = new HashMap<>();
//        HashMap<Character, Integer> map2 = new HashMap<>();
//
//
//        for(int i = 0; i < t.length()-1; i++){
//            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
//        }
//        for(char x : t.toCharArray()){
//            map2.put(x, map2.getOrDefault(x, 0)+1);
//        }
//
//        char[] str = s.toCharArray();
//
//
//        for(int rt = t.length() -1; rt < str.length; rt++){
//            boolean flag = true;
//            map.put(str[rt], map.getOrDefault(str[rt], 0)+1);
//            for(char x : map2.keySet()){
//                if (map.get(x) != map2.get(x)){
//                    flag = false;
//                }
//            }
//            if (flag == true)
//                answer++;
//            map.put(str[lt], map.get(str[lt]) -1);
//            if (map.get(str[lt]) == 0)
//                map.remove(str[lt]);
//            lt++;
//        }
//        return answer;
//    }

    // 일일히 비교하지않고 equals로 간단하게 비교
    public int solution (String s, String t){
        int answer = 0;
        int lt = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();


        for(int i = 0; i < t.length()-1; i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        }
        for(char x : t.toCharArray()){
            map2.put(x, map2.getOrDefault(x, 0)+1);
        }

        char[] str = s.toCharArray();


        for(int rt = t.length() -1; rt < str.length; rt++){
            map.put(str[rt], map.getOrDefault(str[rt], 0)+1);
            if (map.equals(map2))
                answer++;
            map.put(str[lt], map.get(str[lt]) -1);
            if (map.get(str[lt]) == 0)
                map.remove(str[lt]);
            lt++;
        }
        return answer;
    }


    public static void main(String[] args) {
        Four_4 T = new Four_4();
        Scanner kb = new Scanner(System.in);

        String s = kb.next();
        String t = kb.next();
        System.out.println(T.solution(s,t));
    }
}
