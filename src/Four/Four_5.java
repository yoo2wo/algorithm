package Four;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Four_5 {

    public int solution (int n, int k, int[] arr){
        int answer = -1;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0; i <n;i++){
            for(int j = i + 1; j < n; j++){
                for(int l = j + 1; l < n; l++){
                    Tset.add(arr[i] + arr[j] + arr[l]);
                }
            }
        }

        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if (cnt == k)
                return x;
        }
        return answer;
    }

    public static void main(String[] args) {
        Four_5 T = new Four_5();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n,k,arr));
    }
}
