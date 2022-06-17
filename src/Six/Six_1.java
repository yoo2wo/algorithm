package Six;

import java.util.Scanner;

public class Six_1 {

    public int[] solution(int n, int[] arr){
        for(int i = 0; i < n; i++){
            int idx = i;
            for(int j = i+1 ; j < n; j++){
                if (arr[idx] > arr[j])
                    idx = j;
            }
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Six_1 T = new Six_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        for(int i : T.solution(n, arr))
            System.out.print(i + " ");
    }

}
