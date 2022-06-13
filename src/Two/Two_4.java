package Two;

import java.util.Scanner;

public class Two_4 {

    public int[] solution(int n){
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 1;
        for (int i = 2; i < n; i++){
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }

    public static void main(String[] args) {
        Two_4 T = new Two_4();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        for(int x : T.solution(n)){
            System.out.print(x + " ");
        }
    }
}
