import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class removeConsecutiveDuplicateQueue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Queue<Integer> q1 = new LinkedList<>();
        System.out.println("Enter size of queue");
        int size = sc.nextInt();
        for (int i = 0; i < size; i++) {
            q1.add(sc.nextInt());
        }

        Stack<Integer> s = new Stack<>();

        s.push(q1.poll());

        int l = q1.size();
        // System.out.println(l);

        for (int i = 0; i < l; i++) {
            if (q1.peek() != s.peek()) {
                s.push(q1.poll());
            } else {
                q1.poll();
            }
        }
        System.out.println(s);

    }

}
