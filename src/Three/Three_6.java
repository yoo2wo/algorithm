package Three;

import java.util.Scanner;

public class Three_6 {
    public int solution(int n){
        int answer = 0, cnt = 1;
        n--;
        while(n>0){
            cnt++;
            n = n - cnt;
            if (n%cnt == 0) answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Three_6 T = new Three_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
