package Two;

import java.util.Scanner;

public class Two_3 {

    public char[] solution (int n, int[] arrA, int[] arrB){
            char[] answer = new char[n];

            for(int i = 0; i < n; i++){
                if (arrA[i] == arrB[i])
                    answer[i] = 'D';
                else if (arrA[i] + 1 == arrB[i] || (arrA[i]%3 + 1 == arrB[i]%3)){
                    answer[i] = 'B';
                } else{
                    answer[i] = 'A';
                }
            }

            return answer;
    }

    public static void main(String[] args) {
        Two_3 T = new Two_3();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] arrA = new int[n];
        int[] arrB = new int[n];
        for(int i = 0; i < n; i++){
            arrA[i] = kb.nextInt();
        }
        for(int i = 0; i < n; i++){
            arrB[i] = kb.nextInt();
        }
        for(char x: T.solution(n, arrA, arrB)){
            System.out.println(x);
        }
    }
}
