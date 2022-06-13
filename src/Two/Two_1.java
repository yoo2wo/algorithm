package Two;

import java.util.Scanner;

public class Two_1 {
    public void solution (int n, int[] arr){
        int front = Integer.MIN_VALUE;
        for(int i = 0; i < n; i++){
            if (arr[i] > front){
                System.out.print(arr[i] + " ");
            }
            front = arr[i];
        }
    }

    public static void main(String[] args) {
        Two_1 T = new Two_1();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i =0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        T.solution(n, arr);
    }
}
