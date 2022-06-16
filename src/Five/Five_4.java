package Five;

import java.util.Scanner;
import java.util.Stack;

public class Five_4 {
    public int solution (String s){
        int answer = 0;
        int temp = 0;

        Stack<Integer> st = new Stack<>();

        for(char c : s.toCharArray()){
            if (Character.isDigit(c))
                temp = c -'0';
            else if (c == '+')
                temp = st.pop() + st.pop();
            else if (c == '-')
                temp = st.pop() * (-1) + st.pop();
            else if (c == '*')
                temp = st.pop() * st.pop();
            else if (c == '/')
                temp = 1 / st.pop() * st.pop();
            st.push(temp);
        }

        answer = st.pop();

        return answer;
    }

    public static void main(String[] args) {
        Five_4 T = new Five_4();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
