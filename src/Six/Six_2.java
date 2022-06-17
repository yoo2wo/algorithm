package Six;

import java.util.Scanner;

public class Six_2 {
    public int[] solution(int n, int[] arr){
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < n-i-1; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Six_2 T = new Six_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr))
            System.out.print(i + " ");
    }

}
