package Three;

import java.util.Scanner;

public class Three_3 {

    public int solution(int n, int k, int[] arr){
        int answer = 0;
        int sum = 0;

        for(int i = 0; i <k; i++){
            sum += arr[i];
        }
        answer = sum;

        for(int i = k; i <n; i++){
            sum = sum + arr[i] - arr[i - k];
            answer = Math.max(answer, sum);
        }
        return answer;
// 시간복잡도가 딸림
//        for (int i = 0; i < n-k; i++){
//            int sum = 0;
//            for( int j = 0; j < k; j++){
//                sum += arr[i + j];
//            }
//            if (sum > max){
//                max = sum;
//            }
//        }
//        return max;
    }


    public static void main(String[] args) {
        Three_3 T = new Three_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, k, arr));
    }
}
