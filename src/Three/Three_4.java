package Three;

import java.util.Scanner;

public class Three_4 {
    //시간 초과
//    public int solution (int n, int m, int[] arr){
//        int answer = 0;
//
//        for (int i = 1; i <= n; i++){
//            int sum = 0;
//            for(int j = 0; j < i; j++){
//                sum += arr[j];
//            }
//            if (sum == m) answer++;
//            for(int k = i; k <n; k++){
//                sum = sum + arr[k] - arr[k-i];
//                if (sum == m)
//                    answer++;
//            }
//        }
//
//        return answer;
//    }

    public int solution (int n, int m, int[] arr){
        int answer = 0, sum = 0;
        int lt =0;

        for(int rt = 0; rt < n; rt++){
            sum += arr[rt];
            if (sum == m) answer++;
            while(sum >= m){
                sum -= arr[lt];
                lt++;
                if (sum == m) answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Three_4 T = new Three_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,m,arr));
    }
}
