package Two;

import java.util.Scanner;

public class Two_11 {

    public int solution(int n, int[][] arr){
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int k = 0; k < n; k++){
            int count = 0;
            for(int i = 0; i < n; i++){
                for(int j = 0; j < 5; j++){
                    if (arr[k][j] == arr[i][j]){
                        count++;
                        break;
                    }
                }
            }
            if (count > max){
                max = count;
                answer = k+1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Two_11 T = new Two_11();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][5];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < 5; j++){
                arr[i][j] = kb.nextInt();
            }
        }

        System.out.println(T.solution(n, arr));
    }
}
