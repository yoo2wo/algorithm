package Five;

import java.util.Scanner;
import java.util.Stack;

public class Five_5 {
    public int solution(String s){
        int answer = 0;
        char prev = ' ';

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            if (c == '(')
                st.push(c);
            else if (c == ')') {
                st.pop();
                if (prev == '(')
                    answer += st.size();
                else
                    answer++;
            }
            prev = c;
        }

        return answer;
    }

    public static void main(String[] args) {
        Five_5 T = new Five_5();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
