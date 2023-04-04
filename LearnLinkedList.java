import java.util.*;

public class LearnLinkedList {

    public static void main(String[] args) {

        // This is how we declare a LinkedList.
        LinkedList<Integer> ll1 = new LinkedList<>();
        // This is how we add elements in a LinkedList.
        ll1.add(1);
        ll1.add(12);
        ll1.add(3);
        ll1.add(8);
        ll1.add(4);
        ll1.add(8);
        System.out.println(ll1);

        ll1.removeLast();
        ll1.isEmpty();

        // This is how we find the last element of a linked list.
        int z = ll1.getLast();
        System.out.println(z);

        // This is how we add an element at a particular index.
        ll1.add(2, 15);
        System.out.println(ll1);

        // This is how we change the of an element at the given index.
        ll1.set(0, 20);
        System.out.println(ll1);

        // This is how we check if a particular element is present in the LinkedList.
        boolean a = ll1.contains(8);
        System.out.println(a);

        // This is how we find out the index of first occurrence of an element.
        int b = ll1.indexOf(8);
        System.out.println(b);

        // This is how we find out the index of last occurrence of an element.
        int c = ll1.lastIndexOf(8);
        System.out.println(c);

        // Creating another LinkedList.
        LinkedList<Integer> ll2 = new LinkedList<>();
        ll2.add(100);
        ll2.add(110);
        ll2.add(120);
        System.out.println(ll2);

        // This is how we all one list to another LinkedList
        ll1.addAll(ll2);
        System.out.println(ll1);

        // size method will return the length of the LinkedList.
        int size = ll1.size();
        System.out.println(size);

        // get method will return the element at the given index.
        int g = ll1.get(4);
        System.out.println(g);

        // addLast method will add the element at the end of the LinkedList.
        ll1.addLast(500);
        System.out.println(ll1);

        // addFirst method will add the element at the beginning of the LinkedList.
        ll1.addFirst(400);
        System.out.println(ll1);
    }

}


