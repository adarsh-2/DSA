import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class reversingQueueUsingStack {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int l = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> s = new Stack<>();
        
        for (int i = 0; i < l; i++) {
            q.add(sc.nextInt());
        }
        
        for (int i = 0; i < l; i++) {
            s.push(q.poll());
        }
        
        for (int i = 0; i < l; i++) {
            q.add(s.pop());
        }
        System.out.println(q);

    }

}
