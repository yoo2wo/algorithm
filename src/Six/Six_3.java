package Six;

import java.util.Arrays;
import java.util.Scanner;

public class Six_3 {
    public int[] solution(int n, int[] arr){
        for(int i = 1; i < n; i++){
            int temp = arr[i], j;
            for(j = i-1 ; j >= 0; j--){
                if (arr[j] > temp)
                    arr[j+1] = arr[j];
                else
                    break;
            }
            arr[j+1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Six_3 T = new Six_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr))
            System.out.print(i + " ");
    }
}
