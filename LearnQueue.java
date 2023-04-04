import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

    public static void main(String[] args) {

        // This is how we initialize queue
        Queue<Integer> q = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        // This is how we add elements in queue
        q.add(1);
        q.add(1);
        q.add(2);
        q.add(2);
        q.add(3);
        q.add(3);
        q.add(4);
        q.add(4);
        q.add(5);
        q.add(6);
        System.out.println(q);
        System.out.println(q2);
        // System.out.println(q.poll());
        // System.out.println(q);
        // We use size() method to find out the size of the queue.
        // We use peek() method to find out the first element of the queue.
        // We use poll() method to remove the first element of the queue.
        for(int i = 0; i<q.size();i++){
            if(q2.peek()==q.peek()){
                q.poll();
                continue;
            }
            else
            {
                q2.add(q.peek());
                q.poll();
            }
        }
        System.out.println(q2);
    }
    
}
