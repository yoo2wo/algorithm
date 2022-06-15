package Five;

import java.util.Scanner;
import java.util.Stack;

public class Five_1 {

    public String solution(String s){
        String answer = "NO";

        Stack<Character> st = new Stack();
        char[] arr = s.toCharArray();

        try {
            for(int i = 0; i < arr.length; i++){
                if (arr[i] == '(')
                    st.push(arr[i]);
                else if (arr[i] == ')')
                    st.pop();
            }
        } catch (Exception e) {
            return answer;
        }
        if (st.empty())
            answer = "YES";
        return answer;
    }

    public static void main(String[] args) {
        Five_1 T = new Five_1();
        Scanner kb = new Scanner(System.in);
        String s = kb.next();
        System.out.println(T.solution(s));
    }
}
