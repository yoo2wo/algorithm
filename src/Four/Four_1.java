package Four;

import java.util.HashMap;
import java.util.Scanner;

public class Four_1 {

    public char solution(int n, String s){
        char answer = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x, map.getOrDefault(x,0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for(char x : map.keySet()){
            if(map.get(x) > max){
                max = map.get(x);
                answer = x;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Four_1 T = new Four_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(T.solution(n, str));
    }
}
