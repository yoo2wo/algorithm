package Two;

import java.util.Scanner;

public class Two_5 {
    public int solution (int n){
        int answer = 0;
        int[] arr = new int[n+1];

        for(int i = 2; i <= n; i++){
            if (arr[i] == 0){
                answer++;
                for(int j = i; j <= n; j = j + i)
                    arr[j] = 1;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Two_5 T = new Two_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
