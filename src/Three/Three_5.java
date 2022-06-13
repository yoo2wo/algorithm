package Three;

import java.util.Scanner;

public class Three_5 {
//  내가 틀린답
//    public int solution (int n){
//        int answer = 0;
//        int lt = 1, rt = 1;
//        int sum = 0;
//        int[] arr = new int[n/2 + 2];
//
//        for(int i = 0; i <= (n/2 + 1); i++){
//            arr[i] = i;
//        }
//        while (lt <= n/2 && rt <= (n/2 + 1)){
//            sum = 0;
//            for(int i = 0; i < rt - lt; i++){
//                sum += arr[lt+i];
//            }
//            if (sum < n)
//                rt++;
//            else if (sum > n)
//                lt++;
//            else if (sum == n){
//                rt++;
//                lt++;
//                answer++;
//            }
//            System.out.println(lt + "  " + rt + ", sum : " + sum);
//        }
//        return answer;
//    }
    public int solution (int n){
        int answer = 0, sum = 0, lt = 0;
        int m = n/2 + 1;
        int[] arr = new int[m];
        for(int i = 0; i <m; i++) arr[i] = i + 1;

        for(int rt = 0; rt < m; rt++){
            sum+=arr[rt];
            if (sum == n)
                answer++;
            while(sum >=n){
                sum-=arr[lt];
                lt++;
                if (sum == n)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Three_5 T = new Three_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        System.out.println(T.solution(n));
    }
}
