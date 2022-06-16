package Five;

import java.util.LinkedList;
import java.util.Scanner;

public class Five_6 {
    public int solution(int n, int k){
        int answer = 0;

        LinkedList<Integer> arr = new LinkedList<>();

        for(int i = 1; i <= n; i++)
            arr.add(i);

        while(arr.size() > 1){
            for(int i = 0; i < k-1; i++){
                int t = arr.poll();
                arr.offer(t);
            }
            arr.poll();
        }
        answer = arr.peek();

        return answer;
    }

    public static void main(String[] args) {
        Five_6 T = new Five_6();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int k = kb.nextInt();
        System.out.println(T.solution(n,k));
    }
}