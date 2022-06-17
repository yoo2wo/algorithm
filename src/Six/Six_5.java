package Six;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Six_5 {

//    public char solution(int n, int[] arr){
//        char answer = 'D';
//
//        Set<Integer> s = new HashSet<>();
//
//        for(int x : arr)
//            s.add(x);
//        if(s.size() == n)
//            return 'U';
//
//        return answer;
//    }
    public char solution(int n, int[] arr){
        char answer = 'D';
        int prev = 0;

        Arrays.sort(arr);

        for(int x : arr){
            if (x == prev)
                return 'D';
            prev = x;
        }

        return 'U';
    }

    public static void main(String[] args) {
        Six_5 T = new Six_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        System.out.println(T.solution(n, arr));
    }
}
