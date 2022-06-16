package Five;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Five_7 {
    public String solution(String s, String t){
        String answer = "NO";

        Queue<Character> q = new LinkedList<>();
        for(char c : s.toCharArray())
            q.offer(c);

        for(char c : t.toCharArray()){
            if (q.peek() == c)
                q.poll();
            if (q.isEmpty())
                return "YES";
        }
        return answer;
    }

    public static void main(String[] args) {
        Five_7 T = new Five_7();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        String t = kb.next();
        System.out.println(T.solution(s, t));
    }
}
