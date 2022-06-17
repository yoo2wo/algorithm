package Five;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person {
    int id;
    int priority;
    public Person(int id, int priority){
        this.id = id;
        this.priority = priority;
    }
}

public class Five_8 {
    public int solution (int n, int m, int[] arr){
        int answer = 0;

        Queue<Person> q = new LinkedList<>();
        for(int i = 0; i < n; i++)
            q.offer(new Person(i, arr[i]));

        while(!q.isEmpty()){
            Person temp = q.poll();
            for(Person x : q){
                if (x.priority > temp.priority) {
                    q.offer(temp);
                    temp = null;
                    break;
                }
            }
            if (temp != null){
                answer++;
                if (temp.id==m) return answer;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Five_8 T = new Five_8();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int m = kb.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = kb.nextInt();
        System.out.println(T.solution(n,m,arr));
    }
}


