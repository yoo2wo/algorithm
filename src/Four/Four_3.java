package Four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Four_3 {

    public ArrayList<Integer> solution(int n, int k, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < k; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        answer.add(map.size());

        for(int i = 0; i < n - k; i++){
            if (map.getOrDefault(arr[i], 0) <= 1)
                map.remove(arr[i]);
            else
                map.put(arr[i], map.get(arr[i]) - 1);
            map.put(arr[k+i], map.getOrDefault(arr[k+i], 0) + 1);
            answer.add(map.size());
        }

        return answer;
    }

    public static void main(String[] args) {
        Four_3 T = new Four_3();
        Scanner kb = new Scanner(System.in);

        int n = kb.nextInt();
        int k = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            arr[i] = kb.nextInt();
        }
        for (int i : T.solution(n, k, arr)) {
            System.out.print(i + " ");
        }
    }
}
