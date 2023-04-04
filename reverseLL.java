// PS : You are given a LinkedList you have to reverse the linked list
// SC : O(n)
// TC : O(n)

import java.util.*;

public class reverseLL {

    public static void main(String[] args) {
        
        LinkedList<Integer> LL = new LinkedList<>();
        
        LL.add(1);
        LL.add(6);
        LL.add(2);
        LL.add(3);
        LL.add(4);
        LL.add(5);
        
        System.out.println(LL);

        Stack<Integer> s = new Stack<>();

        while (LL.size()>0) {
            s.push(LL.remove());
        }

        System.out.println(s);

        int n = s.size();

        for (int i = 0; i < n; i++) {
            LL.add(s.pop());
        }

        System.out.println(LL);


    }
    
}
