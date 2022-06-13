package Two;

import java.util.Scanner;

public class Two_9 {
    public int solution(int n, int[][] arr){
        int max = Integer.MIN_VALUE;

        int sum3 = 0;
        int sum4 = 0;
        for(int i = 0; i < n;i++){
            int sum1 = 0;
            int sum2 = 0;
            for(int j = 0; j < n;j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max = Math.max(max, sum1);
            max = Math.max(max, sum2);
            sum3 += arr[i][i];
            sum4 += arr[n-1-i][i];
        }
        max = Math.max(max, sum3);
        max = Math.max(max, sum4);
        return max;
    }

    public static void main(String[] args) {
        Two_9 T = new Two_9();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n];

        for(int i = 0; i < n;i++){
            for(int j = 0; j < n;j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
