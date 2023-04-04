import java.util.Iterator;
import java.util.PriorityQueue;

public class priorityQueueString {

    public static void main(String[] args) {
        
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.add("India");
        pq.add("Canada");
        pq.add("USA");

        System.out.println(pq);

        System.out.println(pq.element());

        Iterator iter = pq.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + " ");
        }

    }
    
}























