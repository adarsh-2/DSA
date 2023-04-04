import java.util.*;


public class addTwoNumberLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> myLinkedList = new LinkedList<>();
        myLinkedList.add(2);
        myLinkedList.add(4);
        myLinkedList.add(3);
        // myLinkedList.add(9);
        // myLinkedList.add(9);
        // myLinkedList.add(9);
        // myLinkedList.add(9);
        LinkedList<Integer> myLinkedList2 = new LinkedList<>();
        myLinkedList2.add(5);
        myLinkedList2.add(6);
        myLinkedList2.add(4);
        // myLinkedList2.add(9);
        int a = 0;
        while (myLinkedList.isEmpty() == false) {
            a = a * 10 + myLinkedList.getLast();
            myLinkedList.removeLast();
        }

        int b = 0;
        while (myLinkedList2.isEmpty() == false) {
            b = b * 10 + myLinkedList2.getLast();
            myLinkedList2.removeLast();
        }
        
        int c = a + b;
        System.out.println(c);

        LinkedList<Integer> ll = new LinkedList<>();
        // if(c==0){ll.add(0);}

        while(c>0){
            ll.add(c%10);
            c = c /10;
        }
        System.out.println(ll);
    }

}
