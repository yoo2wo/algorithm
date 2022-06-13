package Three;

import java.util.Map;
import java.util.Scanner;

public class Three_7 {
    public int solution (int n, int k, int[] arr){
        int answer = 0;
        int cnt = 0, lt = 0;

        for(int rt = 0; rt < n; rt++){
            if (arr[rt] == 0)
                cnt++;
            while(cnt > k){
                if (arr[lt] == 0)
                    cnt--;
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;
    }

    public static void main(String[] args) {
        Three_7 T = new Three_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }

}
