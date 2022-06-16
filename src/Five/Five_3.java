package Five;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class Five_3 {

    public int pick(int[][] arr, int p, int n){
        int j = 0;
        while (j < n){
            if (arr[j][p] != 0){
                int ret = arr[j][p];
                arr[j][p] = 0;
                return ret;
            }
            j++;
        }

        return 0;

    }

    public int solution(int n, int[][] arr, int m, int[] move){
        int answer = 0;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < m; i++){
            int temp = 0;
            temp = pick(arr, move[i], n);
            if (temp != 0){
                if (!st.isEmpty()){
                    int check = st.peek();
                    if (temp == check){
                        st.pop();
                        answer = answer + 2;
                    }
                    else
                        st.push(temp);
                } else
                    st.push(temp);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Five_3 T = new Five_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[][] arr = new int[n][n+1];
        for(int i = 0; i < n; i++){
            arr[i][0] = 0;
            for(int j = 1; j <= n; j++){
                arr[i][j] = kb.nextInt();
            }
        }
        int m = kb.nextInt();
        int[] move = new int[m];
        for(int i = 0; i < m; i++){
            move[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr, m, move));
    }
}
