package Six;

import java.util.Arrays;
import java.util.Scanner;

public class Six_4 {

    public int[] solution (int s, int n, int[] arr){
        int[] cache = new int[s];

        for(int i = 0; i < n; i++) {
            int temp = 0;
            for (int j = 0; j < s; j++) {
                if (cache[j] == arr[i])
                    temp = j;
            }
            if (temp != 0) {
                for (int k = temp - 1; k >= 0; k--)
                    cache[k + 1] = cache[k];
            } else {
                for (int k = s - 1; k > 0; k--)
                    cache[k] = cache[k - 1];
            }
            cache[0] = arr[i];
        }
        return cache;
    }

    public static void main(String[] args) {
        Six_4 T = new Six_4();
        Scanner kb= new Scanner(System.in);
        int s = kb.nextInt();
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for(int x : T.solution(s,n,arr))
            System.out.print(x + " ");
    }
}
