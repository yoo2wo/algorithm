package Two;

import java.util.Scanner;

public class Two_12 {

    public int solution(int n, int m, int arr[][]){
        int answer = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j <n; j++){
                //int cnt = 0;
                boolean flag = true;
                for(int a = 0; a < m; a++){
                    int t1 = 0, t2 = 0;
                    for(int b = 0; b <n; b++) {
                        if (arr[a][b] == i + 1) t1 = b;
                        if (arr[a][b] == j + 1) t2 = b;
                    }
                    //if (t1 < t2) cnt++;
                    if (t1 >= t2) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        return answer;
    }

    public static void main (String[] args) {
        Two_12 T = new Two_12();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[][] arr = new int [m][n];
        for (int i = 0; i <m; i++){
            for (int j = 0; j<n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        System.out.println(T.solution(n,m,arr));
    }
}
