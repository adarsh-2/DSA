import java.util.*;

public class heapSortPQ {

    public static void main(String[] args) {
    
        PriorityQueue<Integer> pq = new PriorityQueue<>();
    
        int[] arr = { 27, 12, 9, 43, 38, 53, 6 };
    
        Arrays.stream(arr).forEach(element -> pq.add(element));
    
        while (pq.size() > 0) {
    
            System.out.println(pq.poll() + " ");
    
        }
    
    }
    
}