import java.util.Iterator;
import java.util.PriorityQueue;

public class learnPriorityQueue {

    public static void main(String[] args) {
        
        PriorityQueue<Integer> pq2 = new PriorityQueue<>();
        pq2.add(3);
        pq2.add(2);
        pq2.add(1);
        pq2.add(4);
        pq2.add(5);
        pq2.add(6);

        System.out.println(pq2);

        Iterator iter = pq2.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next() + " ");
        }

    }
    
}





















