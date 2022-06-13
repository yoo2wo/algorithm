package Two;

import java.util.Scanner;

public class Two_10 {

    public int solution(int n, int[][] arr){
        int answer = 0;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, 1, 0, -1};
        //1번 풀이
//        for (int i = 1; i <= n; i++){
//            for (int j = 1; j <= n; j++){
//                if (arr[i][j] > arr[i-1][j] &&
//                        arr[i][j] > arr[i+1][j] &&
//                        arr[i][j] > arr[i][j-1] &&
//                        arr[i][j] > arr[i][j+1])
//                    answer++;
//            }
//        }

        //2번 풀이
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                boolean flag = true;
                for (int k = 0; k < 4; k++){
                    int nx = i+dx[k];
                    int ny = j+dy[k];
                    if (arr[i][j] <= arr[nx][ny]) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    answer++;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Two_10 T = new Two_10();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n+2][n+2];
        for (int i = 0; i < n+2; i++){
            for (int j = 0; j < n+2; j++){
                if (i == 0 || j == 0 || i == n+1 || j == n+1)
                    arr[i][j] = 0;
                else
                    arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n, arr));
    }
}
