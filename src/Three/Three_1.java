package Three;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Three_1 {

    public ArrayList<Integer> solution(int n, int[] arr1, int m, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;

        while(p1 <n && p2 <m){
            if (arr1[p1] < arr2[p2]) answer.add(arr1[p1++]);
            else answer.add(arr2[p2++]);
        }
        while(p1 < n) answer.add(arr1[p1++]);
        while(p2 < m) answer.add(arr2[p2++]);
        return answer;
    }

    public static void main(String[] args) {
        Three_1 T = new Three_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr_1 = new int[n];
        for(int i = 0; i < n; i++){
            arr_1[i] = kb.nextInt();
        }

        int m = kb.nextInt();
        int[] arr_2 = new int[m];
        for(int i = 0; i < m; i++){
            arr_2[i] = kb.nextInt();
        }
        for (int i : T.solution(n, arr_1, m, arr_2)) {
            System.out.print(i + " ");
        }
    }
}
