package Five;

import java.util.*;

public class Five_2 {

    public String solution(String s){
        String answer = "";

        Stack<Character> st = new Stack<>();

        for(char c : s.toCharArray()){
            st.push(c);
            if (c == ')') {
                while (true) {
                    char x = st.pop();
                    if (x == '(')
                        break;
                }
            }
        }

        for(char x : st)
            answer += x;

        return answer;
    }

    public static void main(String[] args) {
        Five_2 T = new Five_2();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
