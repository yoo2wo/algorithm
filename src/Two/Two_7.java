package Two;

import java.util.Scanner;

public class Two_7{

    public int solution(int n, int[] arr) {
//        int answer = 0;
//
//        int[] score = new int[n];
//
//        score[0] = arr[0];
//        answer += score[0];
//        for(int i = 1; i < n; i++){
//            score[i] = arr[i];
//            if (score[i-1] >= 1 && score[i] != 0)
//                score[i] = score[i-1] + 1;
//            answer += score[i];
//        }
//
//        return answer;
        int answer = 0;
        int cnt = 0;
        for(int i = 0; i < n; i++){
            if(arr[i] == 1) {
                cnt++;
                answer += cnt;
            } else if (arr[i] == 0)
                cnt = 0;
        }
        return answer;
    }

    public static void main(String[] args) {
        Two_7 T = new Two_7();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = kb.nextInt();
        }
        System.out.println(T.solution(n, arr));
    }
}
