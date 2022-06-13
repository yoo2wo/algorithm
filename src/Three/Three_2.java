package Three;
import java.util.*;

public class Three_2 {

    public ArrayList<Integer> solution(int n, int[] a, int m, int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        Arrays.sort(a);
        Arrays.sort(b);
        int p1 = 0, p2 = 0;
        while(p1 < n && p2 < m){
            if (a[p1] == b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
                continue;
            }
            if (a[p1] > b[p2])
                p2++;
            else if (a[p1] < b[p2])
                p1++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Three_2 T = new Three_2();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = kb.nextInt();
        }
        int m = kb.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++){
            b[i] = kb.nextInt();
        }
        for (Integer i : T.solution(n,a,m,b)) {
            System.out.print(i + " ");
        }
    }
}
